package com.example.HospitalManagment.Entity;
	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class DoctorDetails {

		@Id
		public int doctorId;
		public String doctorName;
		public String age;
		public String contactNo;
		
		

}



