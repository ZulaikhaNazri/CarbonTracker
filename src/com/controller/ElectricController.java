package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bdUtil.ElectricDAO;
import com.model.Electric;
import com.model.User;


@Controller
@RequestMapping("/RekodElektrik")
public class ElectricController {

	
	@Autowired 
    private HttpSession httpSession;
	
	private ElectricDAO ElectricDAO;

    // Constructor to manually inject ElectricDAO
    public ElectricController() {
        this.ElectricDAO = new ElectricDAO();
    }

	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getAll() {
      
        ModelAndView modelAndView = new ModelAndView("RekodElektrik");
        httpSession.getAttribute("loggedInUser");
        List<Electric> electricList = ElectricDAO.getAll();
        modelAndView.addObject("ElectricList", electricList);
        
        return modelAndView;
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public ModelAndView getById(@RequestParam("id") int id) {
        ModelAndView modelAndView = new ModelAndView("RekodElektrik");
        httpSession.getAttribute("loggedInUser");
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
    public ModelAndView add(@RequestParam ("tarikh")String tarikh, 
    						@RequestParam ("bilangan_hari") int bilangan_hari, 
    						@RequestParam ("faktor_prorata") double faktor_prorata, 
    						@RequestParam ("jumlah_elektrik") double jumlah_elektrik, 
    						@RequestParam ("jumlah_bayaran") double jumlah_bayaran) {
        ModelAndView modelAndView = new ModelAndView("ElectricResponsePage");
        Electric Electric = new Electric();
        User loggedInUser = (User) httpSession.getAttribute("loggedInUser");

		double carbon = calculateCarbon(jumlah_elektrik);
		
        Electric.setUserId(loggedInUser.getId());
		Electric.setTarikh(tarikh);
		Electric.setBilangan_hari(bilangan_hari);
		Electric.setFaktor_prorata(faktor_prorata);
		Electric.setJumlah_elektrik(jumlah_elektrik);
		Electric.setJumlah_bayaran(jumlah_bayaran);
        Electric.setJumlah_karbon(carbon);
        ElectricDAO.add(Electric);
        
        modelAndView.addObject("message", "Electric Consumption Record added successfully!");
        modelAndView.setViewName("ElectricResponsePage");
        
        return modelAndView;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ModelAndView delete(@RequestParam("id") int id) {
        ModelAndView modelAndView = new ModelAndView("ElectricResponsePage");
        httpSession.getAttribute("loggedInUser");
        
        ElectricDAO.delete(id);
        
        modelAndView.addObject("message", "Electric Consumption Record (ID: " + id + ") deleted successfully!");
        modelAndView.setViewName("ElectricResponsePage");
        
        return modelAndView;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(	@RequestParam (name = "id", required = true)int id,  
								@RequestParam ("tarikh")String tarikh, 
								@RequestParam ("bilangan_hari") int bilangan_hari, 
								@RequestParam ("faktor_prorata") double faktor_prorata, 
								@RequestParam ("jumlah_elektrik") double jumlah_elektrik, 
								@RequestParam ("jumlah_bayaran") double jumlah_bayaran) {
        ModelAndView modelAndView = new ModelAndView("ElectricResponsePage");
        if (tarikh != null && id != 0) {
	        Electric Electric = ElectricDAO.getById(id);
	        User loggedInUser = (User) httpSession.getAttribute("loggedInUser");
	        
	        double karbon = calculateCarbon(jumlah_elektrik);
	        
	        Electric.setUserId(loggedInUser.getId());
			Electric.setTarikh(tarikh);
			Electric.setBilangan_hari(bilangan_hari);
			Electric.setFaktor_prorata(faktor_prorata);
			Electric.setJumlah_elektrik(jumlah_elektrik);
			Electric.setJumlah_bayaran(jumlah_bayaran);
	        Electric.setJumlah_karbon(karbon);
	        ElectricDAO.update(Electric);
	        
	     // Redirect to "/recycle/getAll" with success message
	        modelAndView.addObject("message", "Electric Consumption Record (ID: " + id + ") updated successfully!");
	        
//	        List<Electric> elist  = Electricdao.getAll();
//	        modelAndView.addObject("elist", elist);
	        modelAndView.setViewName("RekodElektrik");
        } else {
        	Electric Electric = ElectricDAO.getById(id);

	        List<Electric> elist = new ArrayList<>();
	        elist.add(Electric);

	        modelAndView.addObject("id", id);
	        modelAndView.addObject("elist", elist);  
	    }
        
        return modelAndView;
    }
    
    public double calculateCarbon(double Weight) {
	    // Assuming the constant factor is 0.85 kgCO per kg
	    double carbonFactor = 0.85;
	    
	    // Calculate carbon using the provided formula
	    return Weight * carbonFactor;
	}
}
