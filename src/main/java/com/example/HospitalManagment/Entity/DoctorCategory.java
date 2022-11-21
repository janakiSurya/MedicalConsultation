package com.example.HospitalManagment.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class DoctorCategory {
	
	@Id
	public int doctorId;
	public String duty;
	public String available_hrs; 

	@ManyToOne(cascade = {CascadeType.ALL})
	@NotFound(action = NotFoundAction.IGNORE)
	public DoctorDetails doctorDetails;
	
}
