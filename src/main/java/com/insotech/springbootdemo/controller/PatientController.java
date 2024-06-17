package com.insotech.springbootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.insotech.springbootdemo.model.Patient;
import com.insotech.springbootdemo.model.User;
import com.insotech.springbootdemo.repository.PatientRepository;

@Controller
public class PatientController {

	private List<Patient> patient = new ArrayList<Patient>();
	
	@Autowired
	private PatientRepository patientRepo;
	
	@GetMapping("/patient")
	public String getPatient(@ModelAttribute Patient patient, Model Model) {
		
		return "Patient";
	}
	
	 @PostMapping("/patient")
	 public String postPatient(@ModelAttribute Patient patient, Model model) {
	 
		patientRepo.save(patient);
		return "Patient";
}
}
