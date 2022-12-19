package com.backend.controller;

import com.backend.entity.PatientDetails;
import com.backend.entity.Patients;
import com.backend.pojo.Patient;
import com.backend.pojo.UserDetailsResponse;
import com.backend.repo.HospitalRepo;
import com.backend.repo.Patientdetailsrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class HospitalController {

    @Autowired
    private HospitalRepo hospitalRepo;

    @Autowired
    private Patientdetailsrepo pdrepo;

    @PostMapping("patientpost")
    public PatientDetails postpatient(@RequestBody Patient patient){
        Patients patients=new Patients(patient.getPatientName(),patient.getPatientEmail(),patient.getAdmittedDate());
        Patients pat= hospitalRepo.save(patients);
        PatientDetails pd= new PatientDetails(patient.getPatientEmail(),patient.getPatientReason(),patient.getStatus(),patient.getDoctorName(),patient.getReturnDate(),pat);
        return pdrepo.save(pd);
    }

    @GetMapping("getPatient")
    public List<Patient> getpatient(){

        List<PatientDetails>  pdlist = pdrepo.findAll();
        List<Patient> plist= new ArrayList<>();
        pdlist.forEach(a->{
            Patient p = new Patient(a.getPatient().getId(),a.getPatient().getPatientName(),a.getPatientEmail(),a.getPatient().getAdmittedDate(),a.getPatientReason(),a.getStatus(),a.getDoctorName(),a.getReturnDate());
            plist.add(p);
        });
        return plist;
    }

    @GetMapping("getonepatient/{id}")
    public UserDetailsResponse getPatient2(@PathVariable String id){

        UserDetailsResponse userDetailsResponse = new UserDetailsResponse();

        List<PatientDetails>  pdlist = pdrepo.findAll();
        List<Patient> plist= new ArrayList<>();
        pdlist.forEach(a->{
            if(a.getPatientEmail().equalsIgnoreCase(id)){
                Patient p = new Patient(a.getPatient().getId(),a.getPatient().getPatientName(),a.getPatientEmail(),a.getPatient().getAdmittedDate(),a.getPatientReason(),a.getStatus(),a.getDoctorName(),a.getReturnDate());
                plist.add(p);
            }
        });

        if(plist.get(0)!=null){
            userDetailsResponse.setStatus("true");
            userDetailsResponse.setPatient(plist.get(0));
            return userDetailsResponse;
        }else{
            userDetailsResponse.setStatus("false");
            userDetailsResponse.setMsg("No available");
            return userDetailsResponse;
        }

    }

    @PatchMapping("updateTreatment")
    public int update(@RequestBody Patient patient){
        return pdrepo.updatePatientReasonAndStatusAndDoctorNameAndReturnDateByPatientEmail(patient.getPatientReason(),patient.getStatus(),patient.getDoctorName(),patient.getReturnDate(),patient.getPatientEmail());
    }



    @DeleteMapping("deletepatient/{email}")
    public int deleteStudent(@PathVariable String email){
         pdrepo.deleteByPatientEmail(email);
        return hospitalRepo.deleteByPatientEmail(email);
    }
}
