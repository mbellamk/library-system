package com.bellinfo.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="/home")
	public String getHome(){
		return "home";	
	}
	@RequestMapping(value="/about")
	public String getAbout(){
		return "about";	
	}
}