package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class PageController {
	
	@RequestMapping("/")
	protected ModelAndView getIndex( ) {
		ModelAndView model = new ModelAndView("LoginPage");
		return model;
	}
	
	@RequestMapping("/AdminIndex")
	protected ModelAndView getAdminIndex( ) {
		ModelAndView model = new ModelAndView("AdminIndex");
		return model;
	}
	
	@RequestMapping("/Register")
	protected ModelAndView getRegisterPage( ) {
		ModelAndView model = new ModelAndView("RegisterPage");
		return model;
	}
	
	@RequestMapping("/LamanUtama")
	protected ModelAndView getUserIndex( ) {
		ModelAndView model = new ModelAndView("UserIndex");
		return model;
	}
	
	@RequestMapping("/BorangAir")
	protected ModelAndView getBorangAir( ) {
		ModelAndView model = new ModelAndView("BorangAir");
		return model;
	}
	
	@RequestMapping("/BorangElektrik")
	protected ModelAndView getBorangElektrik( ) {
		ModelAndView model = new ModelAndView("BorangElektrik");
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
	
	@RequestMapping("/RekodAir")
	protected ModelAndView getRekodAir( ) {
		ModelAndView model = new ModelAndView("RekodAir");
		return model;
	}
	
	@RequestMapping("/RekodElektrik")
	protected ModelAndView getRekodElektrik( ) {
		ModelAndView model = new ModelAndView("RekodElektrik");
		return model;
	}
	
	@RequestMapping("/RekodKitarSemula")
	protected ModelAndView getRekodKitarSemula( ) {
		ModelAndView model = new ModelAndView("RekodKitarSemula");
		return model;
	}
	
	@RequestMapping("/Profile")
	protected ModelAndView getProfile( ) {
		ModelAndView model = new ModelAndView("Profile");
		return model;
	}
	
	@RequestMapping("/ProfileAdmin")
	protected ModelAndView getAdminProfile( ) {
		ModelAndView model = new ModelAndView("ProfileAdmin");
		return model;
	}
}
