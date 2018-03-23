package net.eyoel.javaecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	/*
	 * This will display the page.jsp content as long as it maps to the / and /home
	 * params
	 */
	@RequestMapping(value = { "/", "/home" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("homeactive", true);
		return mv;
	}

	@RequestMapping(value = { "/login" })
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Login");
		mv.addObject("loginactive", true);
		return mv;
	}

	@RequestMapping(value = { "/account" })
	public ModelAndView account() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "My Account");
		mv.addObject("accountactive", true);
		return mv;
	}

	@RequestMapping(value = { "/checkout" })
	public ModelAndView checkout() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Checkout");
		mv.addObject("checkoutactive", true);
		return mv;
	}

}
