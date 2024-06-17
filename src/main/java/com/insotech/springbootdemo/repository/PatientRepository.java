package com.insotech.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insotech.springbootdemo.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

	
}
