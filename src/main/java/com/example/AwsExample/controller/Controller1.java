package com.example.AwsExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Controller1 {
	 @GetMapping("/home")
	    public String home() {
	        return "home";
	 } 
}
