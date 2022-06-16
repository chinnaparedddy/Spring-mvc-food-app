package com.ty.food.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

@Controller
public class UserControlers {

	@Autowired
	UserService userService;
	
	@RequestMapping("/loaduser")
	public ModelAndView loadUser() {
		ModelAndView modelAndView=new ModelAndView("adduser.jsp");
		modelAndView.addObject("user", new User());
		return modelAndView;
	}
	@RequestMapping("/usersave")
	public ModelAndView saveUsers(@ModelAttribute User user) {
		userService.addUser(user);
		ModelAndView modelAndView =new ModelAndView("adminmenu.jsp");
		modelAndView.addObject("meg", "add user");
		return modelAndView;
	}
	@RequestMapping("/usersall")
	public ModelAndView allUsers() {
		List<User> users =userService.getAllUsers();
			ModelAndView modelAndView=new ModelAndView("listusers.jsp");
			modelAndView.addObject("users", users);
			return modelAndView;
	
	}
	@RequestMapping("/edituser")
	public ModelAndView editUser(@RequestParam(value = "id")int id) {
		  User user=userService.getUserById(id);
		ModelAndView modelAndView=new ModelAndView("updateuser.jsp");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	@RequestMapping("/userupdate")
	public ModelAndView updateUser(@ModelAttribute User user) {
		boolean flag=userService.updateUser(user.getId(), user);
		if(flag) {
		ModelAndView modelAndView=new ModelAndView("home.jsp");
		modelAndView.addObject("add", "Updated");
		return modelAndView;
		}else {
		ModelAndView modelAndView=new ModelAndView("edituser");
		modelAndView.addObject("add", "Not Updated");
		return modelAndView;
		}
	}
	@RequestMapping("/deleteuser")
	public ModelAndView deleteUser(@RequestParam(value = "id")int id) {
		userService.deletUser(id);
		ModelAndView modelAndView=new ModelAndView("adminmenu.jsp");
		modelAndView.addObject("user", "Deleted");
		return modelAndView;
	}
}
