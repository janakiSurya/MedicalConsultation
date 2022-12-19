package com.backend.pojo;

import com.backend.entity.Patients;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Patient {

    private Long id;

    private String patientName;

    private String patientEmail;


    private String admittedDate;
    private String patientReason;


    private String status;


    private String doctorName;

    private String returnDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getAdmittedDate() {
        return admittedDate;
    }

    public void setAdmittedDate(String admittedDate) {
        this.admittedDate = admittedDate;
    }

    public String getPatientReason() {
        return patientReason;
    }

    public void setPatientReason(String patientReason) {
        this.patientReason = patientReason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public Patient() {

    }

    public Patient(Long id, String patientName, String patientEmail, String admittedDate, String patientReason, String status, String doctorName, String returnDate) {
        this.id = id;
        this.patientName = patientName;
        this.patientEmail = patientEmail;
        this.admittedDate = admittedDate;
        this.patientReason = patientReason;
        this.status = status;
        this.doctorName = doctorName;
        this.returnDate = returnDate;
    }
}
