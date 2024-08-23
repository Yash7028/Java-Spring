package com.spingmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spingmvc.entity.User;
@Controller
public class HomeController {
 
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/register")
	public String signup() {
		
		return "register";
	}
	
	@RequestMapping(path = "/createUser",method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user,@RequestParam("img")String fn) {
		System.out.println("request parameter"+user);
		System.out.println(fn);
		System.out.println("create user method call");
		return "register";
	}
}
