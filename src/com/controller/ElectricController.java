package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bdUtil.ElectricDAO;
import com.model.Electric;


@Controller
@RequestMapping("/RekodElektrik")
public class ElectricController {

	private ElectricDAO ElectricDAO;

    // Constructor to manually inject ElectricDAO
    public ElectricController() {
        this.ElectricDAO = new ElectricDAO();
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ModelAndView getAll() {
      
        ModelAndView modelAndView = new ModelAndView("RekodElektrik");
        List<Electric> electricList = ElectricDAO.getAll();
        modelAndView.addObject("ElectricList", electricList);
        
        return modelAndView;
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public ModelAndView getById(@RequestParam("id") int id) {
        ModelAndView modelAndView = new ModelAndView("RekodElektrik");
        try {
            Electric electric = ElectricDAO.getById(id);

            if (electric != null) {
                List<Electric> electricList = new ArrayList<>();
                electricList.add(electric);
                modelAndView.addObject("electricList", electricList);
                modelAndView.addObject("currentView", "getById");
            } else {
                modelAndView.addObject("message", "Electric Consumption Record with ID " + id + " does not exist");
                modelAndView.setViewName("ElectricResponsePage");
            }
        } catch (NumberFormatException e) {
            modelAndView.addObject("message", "Invalid format!");
            modelAndView.setViewName("ElectricResponsePage");
        } catch (EmptyResultDataAccessException e) {
            modelAndView.addObject("message", "Electric Consumption Record not found. " + e.getLocalizedMessage());
            modelAndView.setViewName("ElectricResponsePage");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView add(@RequestParam ("id")int id, 
    						@RequestParam ("userId") int userId, 
    						@RequestParam ("bulan")String bulan, 
    						@RequestParam ("bilangan_hari") int bilangan_hari, 
    						@RequestParam ("faktor_prorata") double faktor_prorata, 
    						@RequestParam ("jumlah_elektrik") double jumlah_elektrik, 
    						@RequestParam ("jumlah_bayaran") double jumlah_bayaran) {
        ModelAndView modelAndView = new ModelAndView("ElectricResponsePage");
        Electric Electric = new Electric();
        Electric.setId(Integer.parseInt(id));
		Electric.setUserId(Integer.parseInt(userId));
		Electric.setBulan(bulan);
		Electric.setBilangan_hari(bilangan_hari);
		Electric.setFaktor_prorata(faktor_prorata);
		Electric.setJumlah_elektrik(jumlah_elektrik);
		Electric.setJumlah_bayaran(jumlah_bayaran);
		
        ElectricDAO.add(Electric);
        modelAndView.addObject("message", "Water Consumption Record added successfully!");
        modelAndView.setViewName("WaterResponsePage");
        
        return modelAndView;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ModelAndView delete(@RequestParam("id") int id) {
        ModelAndView modelAndView = new ModelAndView("ElectricResponsePage");
        ElectricDAO.delete(id);
        modelAndView.addObject("message", "Electric Consumption Record (ID: " + id + ") deleted successfully!");
        modelAndView.setViewName("ElectricResponsePage");
        return modelAndView;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(	@RequestParam ("id")String id, 
								@RequestParam ("userId") int userId, 
								@RequestParam ("bulan")String bulan, 
								@RequestParam ("bilangan_hari") int bilangan_hari, 
								@RequestParam ("faktor_prorata") double faktor_prorata, 
								@RequestParam ("jumlah_elektrik") double jumlah_elektrik, 
								@RequestParam ("jumlah_bayaran") double jumlah_bayaran) {
        ModelAndView modelAndView = new ModelAndView("ElectricConfirmation");
        Electric Electric = ElectricDAO.getById(Integer.parseInt(id));
		Electric.setUserId(Integer.parseInt(userId));
		Electric.setBulan(bulan);
		Electric.setBilangan_hari(bilangan_hari);
		Electric.setFaktor_prorata(faktor_prorata);
		Electric.setJumlah_elektrik(jumlah_elektrik);
		Electric.setJumlah_bayaran(jumlah_bayaran);
        int rowAffected = ElectricDAO.update(Electric);
        modelAndView.addObject("message", "Electric updated successfully. Rows affected: " + rowAffected);
        return modelAndView;
    }
}
