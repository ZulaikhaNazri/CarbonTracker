package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class PageController {
	
	@RequestMapping("/")
	protected ModelAndView getindex( ) {
		ModelAndView model = new ModelAndView("UserIndex");
		return model;
	
	}
	
	@RequestMapping("/Home")
	protected ModelAndView getUserindex( ) {
		ModelAndView model = new ModelAndView("UserIndex");
		return model;
	
	}
	
	@RequestMapping("/BorangAir")
	protected ModelAndView getBorangAir( ) {
		ModelAndView model = new ModelAndView("BorangAir");
		return model;
	
	}
	
	@RequestMapping("/BorangKitarSemula")
	protected ModelAndView getBorangKitarSemula( ) {
		ModelAndView model = new ModelAndView("BorangKitarSemula");
		return model;
	
	}
	
	@RequestMapping("/RekodBulanan")
	protected ModelAndView getRekodBulanan( ) {
		ModelAndView model = new ModelAndView("RekodBulanan");
		return model;
	
	}
	
	@RequestMapping("/RekodPenyertaan")
	protected ModelAndView getRekodPenyertaan( ) {
		ModelAndView model = new ModelAndView("RekodPenyertaan");
		return model;
	
	}
	
//	@RequestMapping("/RekodAir")
//	protected ModelAndView getRekodAir( ) {
//		ModelAndView model = new ModelAndView("RekodAir");
//		return model;
//	
//	}
}
