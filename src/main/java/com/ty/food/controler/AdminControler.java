package com.ty.food.controler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminControler {

	@RequestMapping("/login")
	public ModelAndView loadasmin(HttpServletRequest req) {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		if(email.equals("naresh@gmail.com")&&password.equals("1234")) {
		ModelAndView modelAndView=new ModelAndView("adminmenu.jsp");
		modelAndView.addObject("admin", "admin");
		return modelAndView;
		}else {
			ModelAndView modelAndView=new ModelAndView("home.jsp");
			modelAndView.addObject("meg", "login Sucessfully");
			return modelAndView;
		}
	}
}
