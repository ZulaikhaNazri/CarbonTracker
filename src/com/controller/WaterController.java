package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bdUtil.WaterDAO;
import com.model.Water;

@Controller
@RequestMapping("/water")
public class WaterController {
	
	@RequestMapping("/getAll")
	@ResponseBody
	public ModelAndView getAll() {
		ModelAndView model = new ModelAndView("RekodAir");
		WaterDAO watdao = new WaterDAO();
		List<Water> wlist = watdao.getAll();
		model.addObject("wlist", wlist);
		model.addObject("currentView", "getAll");
		
		return model;
	}
	
	@RequestMapping("getById")
	@ResponseBody
	public ModelAndView getById(HttpServletRequest req) {
		ModelAndView model = new ModelAndView("RekodAir");
		try {
			String id = req.getParameter("id");
			WaterDAO watdao = new WaterDAO();
			Water water = watdao.getById(id);
			
			if (water != null) {
				List<Water> wList = new ArrayList<>();
				wList.add(water);
				model.addObject("wList", wList);
				model.addObject("currentView", "getById");
			}else {
				model.addObject("message","Water Consumption Record with ID " + id + "does not exist");
				model.setViewName("WaterResponsePage");
			}
		}catch (NumberFormatException e) {
	    	model.addObject("message", "Invalid format!");
		    model.setViewName("WaterResponsePage");
	    }catch (EmptyResultDataAccessException e) {
	    	 model.addObject("message", "Water Consumption Record not found. " + e.getLocalizedMessage());
	    	 model.setViewName("WaterResponsePage");
	    }
		return model;
	}
	
	@RequestMapping("/add")
	@ResponseBody()
	public ModelAndView add(@RequestParam String id, @RequestParam String userId, @RequestParam String bulan, @RequestParam int bilangan_hari, 
			@RequestParam double faktor_prorata, @RequestParam double jumlah_air, @RequestParam double jumlah_bayaran) {
		ModelAndView model = new ModelAndView("WaterResponsePage");
		Water water = new Water();
		WaterDAO watdao = new WaterDAO();
		
		water.setId(id);
		water.setUserID(userId);
		water.setBulan(bulan);
		water.setBilangan_hari(bilangan_hari);
		water.setFaktor_prorata(faktor_prorata);
		water.setJumlah_air(jumlah_air);
		water.setJumlah_bayaran(jumlah_bayaran);
	    watdao.add(water);
		
	    model.addObject("message", "Water Consumption Record added successfully!");
	    model.setViewName("WaterResponsePage");

		return model;
	}
	
	@RequestMapping("/delete")
	@ResponseBody()
	public ModelAndView delete(@RequestParam String id) {
		ModelAndView model = new ModelAndView("waterResponsePage");

	    WaterDAO watdao = new WaterDAO();
	    watdao.delete(id);

	    model.addObject("message", "Water Consumption Record (ID: " + id + ") deleted successfully!");
	    model.setViewName("WaterResponsePage");

	    return model;
	}
	
	@RequestMapping("/update")
	@ResponseBody()
	public ModelAndView update(@RequestParam String id, @RequestParam String userId, @RequestParam String bulan, @RequestParam int bilangan_hari, 
			@RequestParam double faktor_prorata, @RequestParam double jumlah_air, @RequestParam double jumlah_bayaran) {
        ModelAndView model = new ModelAndView("RekodAir");

        model.addObject("currentView", "update");

        WaterDAO watdao = new WaterDAO();

        if (bulan != null && id !=null) {
            Water water = new Water(id, userId, bulan, bilangan_hari, faktor_prorata, jumlah_air, jumlah_bayaran);
            List<Water> wList = new ArrayList<>();
            watdao.update(water);

            model.addObject("wList", wList);
            
            // Redirect to "/instructor/getAll" with success message
            model.addObject("message", "Water Consumption Record (ID: " + id + ") updated successfully!");
            model.setViewName("WaterrResponsePage");
        } else {
            Water water = watdao.getById(id);

            List<Water> wList = new ArrayList<>();
            wList.add(water);

            model.addObject("id", id);
            model.addObject("wList", wList);
        }

		return model;
	}
}
