package com.pravin.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pravin.education.entity.EducationDetails;
import com.pravin.education.repository.EducationDetailsRepository;


@RestController("/education")
public class EducationResourse {
	
	@Autowired
	private  EducationDetailsRepository educationDetailsRepository ;

	@PostMapping("/add")
	public String addDetails(@RequestBody EducationDetails educationDetails) {
		educationDetailsRepository.save(educationDetails);
		return "education details added successfully";
		
	}
	
}
