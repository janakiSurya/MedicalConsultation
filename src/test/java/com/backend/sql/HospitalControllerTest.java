package com.backend.sql;

import com.backend.controller.HospitalController;
import com.backend.entity.PatientDetails;
import com.backend.entity.Patients;
import com.backend.pojo.Patient;
import com.backend.pojo.UserDetailsResponse;
import com.backend.repo.HospitalRepo;
import com.backend.repo.Patientdetailsrepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=HospitalControllerTest.class)
public class HospitalControllerTest {


    @Mock
    Patientdetailsrepo pdRepo;

    @InjectMocks
    @Spy
    HospitalController classUnderTest = new HospitalController();

    @BeforeMethod
    void setUp() throws Exception{
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void update(){
        Patient t=new Patient();
        when(pdRepo.updatePatientReasonAndStatusAndDoctorNameAndReturnDateByPatientEmail(Mockito.any(),Mockito.any(),Mockito.any(),Mockito.any(),Mockito.any())).thenReturn(1);
        int d=classUnderTest.update(t);
        assertEquals(d,1);
    }

}
