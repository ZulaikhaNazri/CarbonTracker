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

import com.bdUtil.InstructorDAO;
import com.bdUtil.WaterDAO;
import com.model.Instructor;
import com.model.Water;

@Controller
@RequestMapping("/RekodAir")
public class WaterController {
	
	@RequestMapping("/")
	@ResponseBody
	public ModelAndView getAll() {
		ModelAndView model = new ModelAndView("RekodAir");
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
		try {
			String id = req.getParameter("id");
			WaterDAO watdao = new WaterDAO();
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
		
		water.setUserID(2);
		water.settarikh(tarikh);
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
	public ModelAndView delete(@RequestParam int id) {
		ModelAndView model = new ModelAndView("waterResponsePage");

	    WaterDAO watdao = new WaterDAO();
	    watdao.delete(id);

	    model.addObject("message", "Water Consumption Record (ID: " + id + ") deleted successfully!");
	    model.setViewName("WaterResponsePage");

	    return model;
	}
	
	@RequestMapping("/update")
	@ResponseBody()
	public ModelAndView update(HttpServletRequest request) {
        ModelAndView model = new ModelAndView("RekodAir");
        
        model.addObject("currentView", "update");
        
        String idParam = request.getParameter("id");
        String tarikh = request.getParameter("tarikh");
        String bil_hariParam = request.getParameter("bilangan_hari");
        String faktor_prorataParam = request.getParameter("faktor_prorata");
        String jumlah_airParam = request.getParameter("jumlah_air");
        String jumlah_bayaranParam = request.getParameter("jumlah_bayaran");
        
        int id = Integer.parseInt(idParam);
        int bil_hari = Integer.parseInt(bil_hariParam);
        double faktor_prorata = Double.parseDouble(faktor_prorataParam);
        double jumlah_air = Double.parseDouble(jumlah_airParam);
        double jumlah_bayaran = Double.parseDouble(jumlah_bayaranParam);
       
        WaterDAO watdao = new WaterDAO();

        if (tarikh != null && id != 0 && bil_hari != 0) {
            Water water = new Water(id, tarikh, bil_hari, faktor_prorata, jumlah_air, jumlah_bayaran);
            List<Water> wlist = new ArrayList<>();
            watdao.update(water);

            model.addObject("wlist", wlist);
            
            model.addObject("message", "Instructor (ID: " + id + ") updated successfully!");
            model.setViewName("WaterResponsePage");
        } else {
            Water water = watdao.getById(id);

            List<Water> wlist = new ArrayList<>();
            wlist.add(water);

            model.addObject("idParam", idParam);
            model.addObject("wlist", wlist);
        }

		return model;
//        WaterDAO watdao = new WaterDAO();
//
//        if (tarikh != null && id!=0 && bil_hari!=0) {
//            Water water = new Water(id, tarikh, bil_hari, faktor_prorata, jumlah_air, jumlah_bayaran);
//            List<Water> wlist = new ArrayList<>();
//            watdao.update(water);
//
//            model.addObject("wlist", wlist);
//            
//            model.addObject("message", "Water Consumption Record (ID: " + idParam + ") updated successfully!");
//            model.setViewName("WaterrResponsePage");
//        } else {
//            Water water = watdao.getById(idParam);
//
//            List<Water> wlist = new ArrayList<>();
//            wlist.add(water);
//
//            model.addObject("id", idParam);
//            model.addObject("wlist", wlist);
//        }
//
//		return model;
	}
}
