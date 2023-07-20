package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.annotation.Resource;

@Controller
public class home {
	
	@RequestMapping("/test")
	@ResponseBody
	public String home() {
		return "this is my home contorollerr";
	}

}
