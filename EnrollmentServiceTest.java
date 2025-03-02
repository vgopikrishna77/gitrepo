package com.mphasis.elearning.servicetest;


	import java.time.LocalDate;
	import java.util.Collections;
	import java.util.List;
	import java.util.Optional;

	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.extension.ExtendWith;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.mockito.MockitoAnnotations;
	import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mphasis.eLearning.entity.Enrollment;
import com.mphasis.eLearning.repository.CategoryRepository;
import com.mphasis.eLearning.repository.CourseRepository;
import com.mphasis.eLearning.service.EnrollmentService;

import static org.mockito.Mockito.*;

	@ExtendWith(SpringExtension.class)
	public class EnrollmentServiceTest {

	    @InjectMocks
	    private EnrollmentService enrollmentService;

	    @Mock
	    private com.mphasis.eLearning.repository.EnrollmentRepository enrollmentRepository;

	    @Mock
	    private com.mphasis.eLearning.repository.EmployeeRepository employeeRepository;

	    @Mock
	    private CourseRepository courseRepository;

	    @BeforeEach
	    public void setup() {
	        MockitoAnnotations.openMocks(this);
	    }

	    @Test
	    public void testAddEnrollment() {
	        com.mphasis.eLearning.entity.Enrollment enrollment = new com.mphasis.eLearning.entity.Enrollment();
	        when(enrollmentRepository.save(enrollment)).thenReturn(enrollment);
	        enrollmentService.addEnrollment(enrollment);
	    }

	    @Test
	    public void testGetEnrollment() {
	        int enrollmentId = 1;
	        when(enrollmentRepository.findById(enrollmentId)).thenReturn(Optional.of(new com.mphasis.eLearning.entity.Enrollment()));
	        enrollmentService.getEnrollment(enrollmentId);
	    }

	    @Test
	    public void testGetAllEnrollments() {
	        when(enrollmentRepository.findAll()).thenReturn(Collections.emptyList());
	        enrollmentService.getAllEnrollments();
	    }

	    @Test
	    public void testDeleteEnrollment() {
	        int enrollmentId = 1;
	        Enrollment enrollment = new Enrollment();
	        when(enrollmentRepository.findById(enrollmentId)).thenReturn(Optional.of(enrollment));
	        enrollmentService.deleteEnrollment(enrollmentId);
	    }

	  
	}


