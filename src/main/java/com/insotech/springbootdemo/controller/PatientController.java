package com.insotech.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.insotech.springbootdemo.model.Patient;

@Controller
public class PatientController {

	@GetMapping("/patient")
	public String getPatient(@ModelAttribute Patient patient, Model Model) {
		
		return "Patient";
	}
	
	
}
