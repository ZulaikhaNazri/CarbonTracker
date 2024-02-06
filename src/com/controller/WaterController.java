package com.controller;

import java.util.ArrayList; 
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bdUtil.WaterDAO;
import com.model.Water;
import com.model.User;

@Controller
@RequestMapping("/RekodAir")
public class WaterController {
	
	@Autowired 
    private HttpSession httpSession;
	
	
	
	@RequestMapping("/")
	@ResponseBody
	public ModelAndView getAll() {
		ModelAndView model = new ModelAndView("RekodAir");
		httpSession.getAttribute("loggedInUser");
		WaterDAO watdao = new WaterDAO();
		List<Water> wlist = watdao.getAll();
		model.addObject("wlist", wlist);
		//model.addObject("currentView", "getAll");
		
		return model;
	}
	
	@RequestMapping("/getById")
	@ResponseBody
	public ModelAndView getById(HttpServletRequest req) {
		ModelAndView model = new ModelAndView("RekodAir");
		httpSession.getAttribute("loggedInUser");
		try {
			String idparam = req.getParameter("id");
			WaterDAO watdao = new WaterDAO();
			int id = Integer.parseInt(idparam);
			Water water = watdao.getById(id);
			
			if (water != null) {
				List<Water> wlist = new ArrayList<>();
				wlist.add(water);
				model.addObject("wlist", wlist);
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
	public ModelAndView add(@RequestParam String tarikh, @RequestParam int bilangan_hari, 
			@RequestParam double faktor_prorata, @RequestParam double jumlah_air, @RequestParam double jumlah_bayaran) {
		ModelAndView model = new ModelAndView("WaterResponsePage");
		Water water = new Water();
		WaterDAO watdao = new WaterDAO();
		User loggedInUser = (User) httpSession.getAttribute("loggedInUser");
		
		double carbon = calculateCarbon(jumlah_air);
		
		water.setUserID(loggedInUser.getId());
		water.settarikh(tarikh);
		water.setBilangan_hari(bilangan_hari);
		water.setFaktor_prorata(faktor_prorata);
		water.setJumlah_air(jumlah_air);
		water.setJumlah_bayaran(jumlah_bayaran);
		water.setJumlah_karbon(carbon);
	    watdao.add(water);
		
	    model.addObject("message", "Water Consumption Record added successfully!");
	    model.setViewName("WaterResponsePage");

		return model;
	}
	
	@RequestMapping("/delete")
	@ResponseBody()
	public ModelAndView delete(@RequestParam int id) {
		ModelAndView model = new ModelAndView("waterResponsePage");
		httpSession.getAttribute("loggedInUser");

	    WaterDAO watdao = new WaterDAO();
	    watdao.delete(id);

	    model.addObject("message", "Water Consumption Record (ID: " + id + ") deleted successfully!");
	    model.setViewName("WaterResponsePage");

	    return model;
	}
	
	 @RequestMapping("/update")
	    public ModelAndView update(	@RequestParam (name = "id", required = true)int id,  
									@RequestParam ("tarikh")String tarikh, 
									@RequestParam ("bilangan_hari") int bilangan_hari, 
									@RequestParam ("faktor_prorata") double faktor_prorata, 
									@RequestParam ("jumlah_air") double jumlah_air, 
									@RequestParam ("jumlah_bayaran") double jumlah_bayaran) {
	        ModelAndView modelAndView = new ModelAndView("RekodAir");
	        WaterDAO watdao = new WaterDAO();
	        if (tarikh != null && id != 0) {
	        	
		        Water water = watdao.getById(id);
				water.settarikh(tarikh);
				water.setBilangan_hari(bilangan_hari);
				water.setFaktor_prorata(faktor_prorata);
				water.setJumlah_air(jumlah_air);
				water.setJumlah_bayaran(jumlah_bayaran);
				double karbon = calculateCarbon(jumlah_air);
		        water.setJumlah_karbon(karbon);
		        watdao.update(water);
		        
		     // Redirect to "/recycle/getAll" with success message
		        modelAndView.addObject("message", "Water Consumption Record (ID: " + id + ") updated successfully!");
		        
//		        List<Electric> elist  = Electricdao.getAll();
//		        modelAndView.addObject("elist", elist);
		        modelAndView.setViewName("RekodAir");
	        } else {
	        	Water water = watdao.getById(id);

		        List<Water> wlist = new ArrayList<>();
		        wlist.add(water);

		        modelAndView.addObject("id", id);
		        modelAndView.addObject("wlist", wlist);  
		    }
	        return modelAndView;
	 }
	
	public double calculateCarbon(double totalwater) {
		
		double faktor = 0.419;
		double karbon = totalwater * faktor;
		
		return karbon;
		
	}
	
}
