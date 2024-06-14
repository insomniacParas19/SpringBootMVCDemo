package com.insotech.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.insotech.springbootdemo.model.Patient;
@Controller
public class PatientFormController {
	
	@GetMapping("/addpatient")
	public String addPatient() {
		
		return "PatientForm";
	}
	
	@PostMapping("/addpatient")
	public String addPatient(@ModelAttribute Patient patient, Model model) {
		
		return "";
	}
}
