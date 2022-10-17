package com.example.HospitalManagment.Entity;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;

	@Entity
	@Table(name="DoctorDetails")
	public class DoctorDetails {

		/**
		 * Customer Entity persisted in Repository
		 */
		public DoctorDetails(//long id,
				int doctorId,
				@NotBlank @Size(min = 3, max = 20, message = "Patient Name should be in between 3 to 20 characters") String doctorFirstName,
				@NotBlank @Size(min = 3, max = 20, message = "Patient Name should be in between 3 to 20 characters") String doctorLastName,
				@NotBlank(message = "Address should not be blank") @Size(max = 50) String address, 
				@NotBlank(message = "emailId should not be blank") String emailId,
				
			    long phoneNo) {
			super();
			this.doctorId = doctorId;
			this.doctorFirstName = doctorFirstName;
			this.doctorLastName = doctorLastName;
			this.address = address;
			this.emailId = emailId;
			this.phoneNo = phoneNo;
		}
		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "doctorId")
		private int doctorId;

		@NotBlank
		@Size(min = 3, max = 20, message = "Doctor Name should be in between 3 to 20 characters")
		private String doctorFirstName;
		
		@NotBlank
		@Size(min = 3, max = 20, message = "Doctor Name should be in between 3 to 20 characters")
		private String doctorLastName;
		@NotBlank(message = "Phone number  should not be blank")
		private long phoneNo;
		
		@NotBlank(message = "EmailId should not be blank")
		private String emailId;

		public long getPhoneNo() {
			return phoneNo;
		}
		public int getDoctorId() {
			return doctorId;
		}
		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}
		public String getDoctorFirstName() {
			return doctorFirstName;
		}
		public void setDoctorFirstName(String doctorFirstName) {
			this.doctorFirstName = doctorFirstName;
		}
		public String getDoctorLastName() {
			return doctorLastName;
		}
		public void setDoctorLastName(String doctorLastName) {
			this.doctorLastName = doctorLastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		@NotBlank(message = "Address should not be blank")
		@Size(max = 50)
		private String address;

}



