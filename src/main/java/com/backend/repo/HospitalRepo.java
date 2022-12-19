package com.backend.repo;

import com.backend.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface HospitalRepo extends JpaRepository<Patients, Long> {
//    @Transactional
//    @Modifying
//    @Query("update Patient p set p.status = ?1, p.returnDate = ?2, p.doctorName = ?3, p.patientReason = ?4 " +
//            "where p.patientEmail = ?5")
//    int updateStatusAndReturnDateAndDoctorNameAndPatientReasonByPatientEmail(String status, String returnDate, String doctorName, String patientReason, String patientEmail);

    @Transactional
    @Modifying
    @Query("delete from Patients p where p.patientEmail = ?1")
    int deleteByPatientEmail(String patientEmail);

    @Query("select p from Patients p where p.patientEmail = ?1")
    Patients findByPatientEmail(String patientEmail);



}
