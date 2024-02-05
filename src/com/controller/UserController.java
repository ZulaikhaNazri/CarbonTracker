package com.controller;

import com.bdUtil.UserDAO;
import com.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired 
    private HttpSession httpSession;

	@PostMapping("/SubmitRegistration")
    public ModelAndView addUser(@RequestParam String name, @RequestParam String address,
                                @RequestParam String email, @RequestParam String category,
                                @RequestParam String username, @RequestParam String password,
                                RedirectAttributes redirectAttributes) {
        UserDAO userdao = new UserDAO();
        User user = new User();
        user.setName(name);
        user.setAddress(address);
        user.setEmail(email);
        user.setCategory(category);
        user.setUsername(username);
        user.setPassword(password);

        int rowAffected = userdao.addUser(user);

        ModelAndView modelAndView = new ModelAndView("redirect:/Register");

        if (rowAffected > 0) {
            // User added successfully, add a success message
            redirectAttributes.addFlashAttribute("message", "User added successfully!");
        } else {
            // User addition failed, add an error message
            redirectAttributes.addFlashAttribute("error", "Failed to add user. Please try again.");
        }

        return modelAndView;
    }

	@RequestMapping("/submit")
	public ModelAndView loginUser(@RequestParam String username, @RequestParam String password,
            RedirectAttributes redirectAttributes) {
		
	UserDAO userDAO = new UserDAO();
	List<User> users = userDAO.getAllUsers();
	
	for (User user : users) {
		if (user.getUsername().equals(username) && user.getPassword().equals(password)) {

			// Successful login, store user information in session
	        httpSession.setAttribute("loggedInUser", user);
			ModelAndView modelAndView = new ModelAndView("redirect:/LamanUtama"); // Redirect to the home page after login
			return modelAndView;
		}
	}
	// Failed login, add an error message
	redirectAttributes.addFlashAttribute("error", "Invalid username or password");
	return new ModelAndView("redirect:/"); // Redirect back to the login page with an error message
	}
	
	@RequestMapping("/logout")
	public String logout() {
	    // Invalidate the session on logout
	    httpSession.invalidate();
	    return "redirect:/";
	}
	
	@RequestMapping("/update")
	public ModelAndView updateUser(HttpServletRequest request, RedirectAttributes redirectAttributes) {
	    
	    UserDAO userDAO = new UserDAO();

	    // Retrieve the logged-in user from session
	    User loggedInUser = (User) httpSession.getAttribute("loggedInUser");

	    // Check if the user is logged in
	    if (loggedInUser != null) {
	        // Get updated user information from the request
	        String name = request.getParameter("name");
	        String address = request.getParameter("address");
	        String email = request.getParameter("email");
	        String category = request.getParameter("category");
	        String username = request.getParameter("username");

	        // Create a User object with the updated information
	        User updatedUser = new User(loggedInUser.getId(), name, address, email, category, username, loggedInUser.getPassword());

	        // Call the updateUser method in UserDAO
	        int rowsAffected = userDAO.updateUser(updatedUser);

	        ModelAndView modelAndView = new ModelAndView("redirect:/Profile");

	        if (rowsAffected > 0) {
	        	// User updated successfully, update the attributes in the session
	            loggedInUser.setName(name);
	            loggedInUser.setAddress(address);
	            loggedInUser.setEmail(email);
	            loggedInUser.setCategory(category);
	            loggedInUser.setUsername(username);

	            // Update the session attribute
	            httpSession.setAttribute("loggedInUser", loggedInUser);
	        	
	            // User updated successfully, add a success message
	            redirectAttributes.addFlashAttribute("message", "User (ID: " + loggedInUser.getId() + ") updated successfully!");
	        } else {
	            // User update failed, add an error message
	            redirectAttributes.addFlashAttribute("error", "Failed to update user (ID: " + loggedInUser.getId() + "). Please try again.");
	        }

	        return modelAndView;
	    } else {
	        // User is not logged in, redirect to login page or handle accordingly
	        return new ModelAndView("redirect:/");
	    }
	}

	@RequestMapping("/updatePassword")
	public ModelAndView updateUserPassword(HttpServletRequest request, RedirectAttributes redirectAttributes) {
	    
	    UserDAO userDAO = new UserDAO();

	    // Retrieve the logged-in user from session
	    User loggedInUser = (User) httpSession.getAttribute("loggedInUser");

	 // Check if the user is logged in
	    if (loggedInUser != null) {
	        // Get updated user information from the request
	        String currentPassword = request.getParameter("currentPassword");
	        String newPassword = request.getParameter("newPassword");
	        String renewPassword = request.getParameter("renewPassword");

	        // Check if the currentPassword, newPassword, and renewPassword are not null
	        if (currentPassword == null || newPassword == null || renewPassword == null) {
	            // Handle the case where any of the parameters is null
	            redirectAttributes.addFlashAttribute("error", "Invalid parameters. Please try again.");
	            return new ModelAndView("redirect:/Profile");
	        }

	        // Check if the provided current password matches the user's actual current password
	        if (!currentPassword.equals(loggedInUser.getPassword())) {
	            // Current password doesn't match, add an error message
	            redirectAttributes.addFlashAttribute("error", "Current password is incorrect. Please try again.");
	            return new ModelAndView("redirect:/Profile");
	        }

	        // Check if the new password and re-entered new password match
	        if (!newPassword.equals(renewPassword)) {
	            // New password and re-entered new password don't match, add an error message
	            redirectAttributes.addFlashAttribute("error", "New password and re-entered password do not match. Please try again.");
	            return new ModelAndView("redirect:/Profile");
	        }

	        // Create a User object with the updated information
	        User updatedUser = new User(loggedInUser.getId(), loggedInUser.getName(), loggedInUser.getAddress(), loggedInUser.getEmail(), loggedInUser.getCategory(), loggedInUser.getUsername(), newPassword);

	        // Call the updateUser method in UserDAO
	        int rowsAffected = userDAO.updateUser(updatedUser);

	        ModelAndView modelAndView = new ModelAndView("redirect:/Profile");

	        if (rowsAffected > 0) {
	            // User updated successfully, update the attributes in the session
	            loggedInUser.setPassword(newPassword);

	            // Update the session attribute
	            httpSession.setAttribute("loggedInUser", loggedInUser);

	            // User updated successfully, add a success message
	            redirectAttributes.addFlashAttribute("message", "User (ID: " + loggedInUser.getId() + ") updated successfully!");
	        }
	        return modelAndView;
	    } else {
	        // User is not logged in, redirect to login page or handle accordingly
	        return new ModelAndView("redirect:/");
	    }
	}
}