package com.example.HospitalManagment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HospitalManagment.Entity.DoctorCategory;

public interface DoctorCategoryRepository extends JpaRepository<DoctorCategory, Integer> {

}
