package com.example.HospitalManagment.Controller;


import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors; 

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HospitalManagment.Entity.DoctorDetails;

@RestController
@CrossOrigin(origins="*")
public class Controller {
	
	
	@GetMapping("DoctorDetails")
	public List<DoctorDetails> getDoctors(){
		
		return Stream.of(new DoctorDetails(11, "Doctor","A","Street1","docA@gmail.com",123456789),
				new DoctorDetails(12, "Doctor","B","Street2","docB@gmail.com",12345678),
				new DoctorDetails(13, "Doctor","C","Street3","docC@gmail.com",1234567)).collect(Collectors.toList());
		
	}

}
