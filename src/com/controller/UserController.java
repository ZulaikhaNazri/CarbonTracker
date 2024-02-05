package com.controller;

import com.bdUtil.UserDAO;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping("/SubmitRegisteration")
    public ModelAndView addUser(@RequestParam String name, @RequestParam String address,
	        @RequestParam String email, @RequestParam String category, 
	        @RequestParam String username,@RequestParam String password) {
    	
    	ModelAndView modelAndView = new ModelAndView("");
    	
        UserDAO userdao = new UserDAO();
        User user = new User();
        user.setName(name);
        user.setAddress(address);
        user.setEmail(email);
        user.setCategory(category);
        user.setUsername(username);
        user.setPassword(password);
        int rowAffected = userdao.addUser(user);
        
        modelAndView.addObject("message", "User added successfully!");
	    modelAndView.setViewName("");
	    
	    return modelAndView;
    }

	/*
	 * @RequestMapping("/submit") public String loginUser(@ModelAttribute("user")
	 * User user, Model model) { // Perform login logic, check credentials against
	 * the database List<User> users = userDAO.getAllUsers(); for (User u : users) {
	 * if (u.getUsername().equals(user.getUsername()) &&
	 * u.getPassword().equals(user.getPassword())) { // Successful login, you can
	 * add session management logic here return "redirect:/LamanUtama"; // Redirect
	 * to the home page after login } } // Failed login, add an error message to the
	 * model model.addAttribute("error", "Invalid username or password");
	 * 
	 * return "redirect:/"; }
	 */
}
