package com.insotech.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Use to process http requests
public class IndexController {
	
	@GetMapping("/")	//root url(call at start)
	public String getIndex() {
		
		return "Index";
	}

}
