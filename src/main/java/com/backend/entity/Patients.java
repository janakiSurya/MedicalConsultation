package com.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patients {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false,unique = true)
    private Long id;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "patient_email",nullable = false)
    private String patientEmail;

    @Column(name = "admitted_date")
    private String admittedDate;





    public String getAdmittedDate() {
        return admittedDate;
    }

    public void setAdmittedDate(String admittedDate) {
        this.admittedDate = admittedDate;
    }



    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patients() {
    }

    public Patients(String patientName, String patientEmail, String admittedDate) {
        this.patientName = patientName;
        this.patientEmail = patientEmail;
        this.admittedDate = admittedDate;
    }
}
