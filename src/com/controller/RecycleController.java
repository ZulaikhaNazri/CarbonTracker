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

import com.bdUtil.RecycleDAO;
import com.model.Recycle;


@Controller
@RequestMapping("RekodRecycle")
public class RecycleController {
	
	@RequestMapping("/")
	@ResponseBody
	public ModelAndView getAll() {
		ModelAndView model = new ModelAndView("RekodRecycle");
		RecycleDAO recdao = new RecycleDAO();
		List<Recycle> ilist = recdao.getAll();
		model.addObject("ilist", ilist);
		//model.addObject("currentView", "getAll");
		
		return model;
	}
	
	@RequestMapping("/getById")
	@ResponseBody
	public ModelAndView getById(HttpServletRequest req) {
		ModelAndView model = new ModelAndView("RekodRecycle");
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			RecycleDAO recdao = new RecycleDAO();
			Recycle recycle = recdao.getById(id);
			
			if (recycle != null) {
				List<Recycle> ilist = new ArrayList<>();
				ilist.add(recycle);
				model.addObject("ilist", ilist);
				model.addObject("currentView", "getById");
			}else {
				model.addObject("message","Recycle Consumption Record with ID " + id + "does not exist");
				model.setViewName("RecycleResponsePage");
			}
		}catch (NumberFormatException e) {
	    	model.addObject("message", "Invalid format!");
		    model.setViewName("RecycleResponsePage");
	    }catch (EmptyResultDataAccessException e) {
	    	 model.addObject("message", "Recycle Consumption Record not found. " + e.getLocalizedMessage());
	    	 model.setViewName("RecycleResponsePage");
	    }
		return model;
	}
	
	@RequestMapping("/add")
	@ResponseBody()
	public ModelAndView add(@RequestParam String tarikh,
			 @RequestParam double jumlah_recycle, @RequestParam double jumlah_bayaran) {
		ModelAndView model = new ModelAndView("RecycleResponsePage");
		Recycle recycle = new Recycle();
		RecycleDAO recdao = new RecycleDAO();
		
		double carbon = calculateCarbon(jumlah_recycle);
		
		recycle.setUserId(7);
		recycle.setTarikh(tarikh);
		recycle.setJumlah_recycle(jumlah_recycle);
		recycle.setJumlah_bayaran(jumlah_bayaran);
		recycle.setJumlah_carbon(carbon);
		recdao.add(recycle);

	    model.addObject("message", "Recycle Consumption Record added successfully!");
	    model.setViewName("RecycleResponsePage");

		return model;
	}
	
//	@RequestMapping("/add")
//	@ResponseBody()
//	public ModelAndView add(@RequestParam String tarikh,
//	                        @RequestParam double jumlah_recycle,
//	                        @RequestParam double jumlah_bayaran) {
//	    ModelAndView model = new ModelAndView("RecycleResponsePage");
//
//	    // Calculate carbon using the provided formula
//	    double carbon = calculateCarbon(jumlah_recycle);
//
//	    // Create a Recycle object with the calculated carbon and other parameters
//	    Recycle recycle = new Recycle();
//	    recycle.setTarikh(tarikh);
//	    recycle.setJumlah_recycle(jumlah_recycle);
//	    recycle.setJumlah_bayaran(jumlah_bayaran);
//	    recycle.setJumlah_carbon(carbon);  // Assuming you have a setter for carbon in your Recycle class
//
//	    // Add the Recycle object to the database using your RecycleDAO
//	    RecycleDAO recdao = new RecycleDAO();
//	    recdao.add(recycle);
//
//	    model.addObject("message", "Recycle Consumption Record added successfully!");
//
//	    return model;
//	}
	public double calculateCarbon(double recycleWeight) {
	    // Assuming the constant factor is 2.860 kgCO per kg
	    double carbonFactor = 2.860;
	    Recycle recycle = new Recycle();
	    
	    // Calculate carbon using the provided formula
	    double carbon = recycleWeight * carbonFactor;
	    recycle.setJumlah_carbon(carbon);
	    return carbon;
	}
	@RequestMapping("/delete")
	@ResponseBody()
	public ModelAndView delete(@RequestParam int id) {
		ModelAndView model = new ModelAndView("RecycleResponsePage");

		RecycleDAO recdao = new RecycleDAO();
	    recdao.delete(id);

	    model.addObject("message", "Recycle Consumption Record (ID: " + id + ") deleted successfully!");
	    model.setViewName("RecycleResponsePage");

	    return model;
	}
	
	@RequestMapping("/update")
	@ResponseBody()
	public ModelAndView update(	@RequestParam(name = "id", required = true) int id, 
								@RequestParam(name = "tarikh") String tarikh,
								@RequestParam(name = "jumlah_recycle") double jumlah_recycle, 
								@RequestParam(name = "jumlah_bayaran") double jumlah_bayaran) {
	    ModelAndView model = new ModelAndView("RecycleResponsePage");

	    RecycleDAO recdao = new RecycleDAO();

	    if (tarikh != null && id != 0) {
	        Recycle recycle = recdao.getById(id);
	        
	        recycle.setTarikh(tarikh);
	        recycle.setJumlah_recycle(jumlah_recycle);
	        recycle.setJumlah_bayaran(jumlah_bayaran);
	        recdao.update(recycle);

	        // Redirect to "/recycle/getAll" with success message
	        model.addObject("message", "Recycle Consumption Record (ID: " + id + ") updated successfully!");
	        
//	        List<Recycle> ilist  = recdao.getAll();
//	        model.addObject("ilist", ilist);  // Corrected typo here
	        model.setViewName("RecycleResponsePage");
	    } else {
	        Recycle recycle = recdao.getById(id);

	        List<Recycle> ilist = new ArrayList<>();
	        ilist.add(recycle);

	        model.addObject("id", id);
	        model.addObject("ilist", ilist);  // Corrected typo here
	    }

	    return model;
	}

	
	
	
//    @RequestMapping("/update")
//    public ModelAndView update(HttpServletRequest request) {
//        ModelAndView modelAndView = new ModelAndView("recycle");
//
//        String idParam = request.getParameter("id");
//        String tarikh = request.getParameter("tarikh");
//        String jumlah_recycle = request.getParameter("jumlah_recycle");
//        String jumlah_bayaran = request.getParameter("jumlah_bayaran");
//
//        modelAndView.addObject("currentView", "update");
//
//        int id = Integer.parseInt(idParam);
//        RecycleDAO recdao = new RecycleDAO();
//
//        if (tarikh != null && jumlah_recycle != null && jumlah_bayaran != null) {
//            Recycle recycle = new Recycle();
//            List<Recycle> ilist = new ArrayList<>();
//            recdao.update(recycle);
//
//            modelAndView.addObject("recycle", ilist);
//            
//            // Redirect to "/instructor/getAll" with success message
//            modelAndView.addObject("message", "Recycle (ID: " + id + ") updated successfully!");
//            modelAndView.setViewName("RecycleResponsePage");
//        } else {
//            Recycle recycle = recdao.getById(id);
//
//            List<Recycle> ilist = new ArrayList<>();
//            ilist.add(recycle);
//
//            modelAndView.addObject("idParam", idParam);
//            modelAndView.addObject("recycle", ilist);
//        }
//
//		return modelAndView;
//	}

}
