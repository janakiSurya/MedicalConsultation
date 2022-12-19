package com.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "patient_details")
public class PatientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "patient_email",nullable = false)
    private String patientEmail;
    @Column(name = "patient_reason")
    private String patientReason;

    @Column(name = "status")
    private String status;

    @Column(name = "doctor_name")
    private String doctorName;
    @Column(name = "return_date")
    private String returnDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private Patients patient;

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PatientDetails() {
    }

    public PatientDetails(String patientEmail, String patientReason, String status, String doctorName, String returnDate, Patients patient) {
        this.patientEmail = patientEmail;
        this.patientReason = patientReason;
        this.status = status;
        this.doctorName = doctorName;
        this.returnDate = returnDate;
        this.patient = patient;
    }
}
