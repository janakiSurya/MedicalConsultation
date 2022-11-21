package com.example.HospitalManagment.Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HospitalManagment.Entity.DoctorCategory;
import com.example.HospitalManagment.Entity.DoctorDetails;
import com.example.HospitalManagment.Repository.DoctorCategoryRepository;

@RestController
@CrossOrigin(origins="*")
public class Controller {
	
	
	@Autowired
	DoctorCategoryRepository doctorCategorytRepo;
	
	
	@GetMapping("/getDoctorDetails")
	public List<DoctorCategory> getDoctors(){
		
		DoctorDetails doctorDetails = new DoctorDetails();
		doctorDetails.doctorId=1;
		doctorDetails.doctorName="Surya";
		doctorDetails.age="23";
		doctorDetails.contactNo="1234567890";
		
		
		DoctorCategory pc = new DoctorCategory();
		pc.doctorId=1;
		pc.duty="heart surgeon";
		pc.available_hrs="9:00AM-2PM";
		pc.doctorDetails=doctorDetails;
		
		DoctorCategory pc1 = new DoctorCategory();
		pc1.doctorId=2;
		pc1.duty="patientService";
		pc1.available_hrs="4PM-9PM";
		pc1.doctorDetails=doctorDetails;
		
		List<DoctorCategory> list = new ArrayList<>();
		list.add(pc);
		list.add(pc1);
		
		
		return doctorCategorytRepo.saveAll(list);
		
		
	}

}
