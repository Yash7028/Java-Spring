package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model m) {
		m.addAttribute("name", "yash");
		m.addAttribute("roll", 111);

		List<String> list = new ArrayList<String>();
		list.add("Nilesh");
		list.add("Saurabh");
		list.add("Pratham");

		m.addAttribute("nameList", list);
		return "home";
	}

	@RequestMapping(path="/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("className", "16th class");
		model.addObject("regNumber", 54344);

		List<String> list = new ArrayList<String>();
		list.add("Nilesh");
		list.add("Saurabh");
		list.add("Pratham");

		model.addObject("nameList", list);

		model.setViewName("login");
		return model;
	}

	@RequestMapping(name="/register", method =RequestMethod.POST )
	public String register() {

		return " ";
	}
}
