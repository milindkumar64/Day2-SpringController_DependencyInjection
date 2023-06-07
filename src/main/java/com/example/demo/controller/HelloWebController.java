package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody // in this case return sts ll print rather than hello.html
public class HelloWebController {

	@GetMapping("/web")
	public String hello() {
		return "hello";
	}
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message","Hello From Bridgelabz");
		return "message";
	}
}
