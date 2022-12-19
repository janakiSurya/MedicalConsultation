package com.backend.repo;

import com.backend.entity.PatientDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface Patientdetailsrepo extends JpaRepository<PatientDetails, Long> {
    @Transactional
    @Modifying
    @Query("delete from PatientDetails p where p.patientEmail = ?1")
    void deleteByPatientEmail(String patientEmail);

    @Transactional
    @Modifying
    @Query("update PatientDetails p set p.patientReason = ?1, p.status = ?2, p.doctorName = ?3, p.returnDate = ?4 " +
            "where p.patientEmail = ?5")
    int updatePatientReasonAndStatusAndDoctorNameAndReturnDateByPatientEmail(String patientReason, String status, String doctorName, String returnDate, String patientEmail);
}
