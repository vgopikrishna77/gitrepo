package com.mphasis.elearning.servicetest;



	import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.extension.ExtendWith;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.mockito.MockitoAnnotations;
	import org.springframework.test.context.junit.jupiter.SpringExtension;

	import com.mphasis.eLearning.entity.Assign;
	import com.mphasis.eLearning.entity.Course;
	import com.mphasis.eLearning.entity.Employee;
	import com.mphasis.eLearning.entity.Manager;
	import com.mphasis.eLearning.entity.Team;
	import com.mphasis.eLearning.repository.AssignRepository;
	import com.mphasis.eLearning.repository.CourseRepository;
	import com.mphasis.eLearning.repository.EmployeeRepository;
	import com.mphasis.eLearning.repository.ManagerRepository;
	import com.mphasis.eLearning.repository.TeamRepository;
import com.mphasis.eLearning.service.AssignService;

import static org.mockito.Mockito.*;

	@ExtendWith(SpringExtension.class)
	public class AssignServiceTest {

	    @InjectMocks
	    private AssignService assignService;

	    @Mock
	    private AssignRepository assignRepository;

	    @Mock
	    private TeamRepository teamRepository;

	    @Mock
	    private EmployeeRepository employeeRepository;

	    @Mock
	    private ManagerRepository managerRepository;

	    @Mock
	    private CourseRepository courseRepository;

	    @BeforeEach
	    public void setup() {
	        MockitoAnnotations.openMocks(this);
	    }
private List<Assign> getAllAssign(){
	Assign a=new Assign();
	a.setAssignId(1);
	Course c=new Course();
	Employee e=new  Employee();
	a.setEmployeeRef(e);
	a.setCourseRef(c);
	Manager m=new Manager();
	a.setManagerRef(m);
	List<Assign> a1=new ArrayList<>();
	a1.add(a);
}
	    
	    @Test
	    public void testAssign() {
	        Assign assign = getAllAssign().get(0);
	        when(assignRepository.save(any())).thenReturn(assign);
	        assignService.assin(any());
	    }

	    @Test
	    public void testGetAll() {
	        assignService.getAll();
	        when(assignRepository.findAll()).thenReturn(null);
	    }

	    @Test
	    public void testGetTeamId() {
	        int employeeId = 1;
	        when(teamRepository.getTeamId(employeeId)).thenReturn(101);
	        assignService.getTeamId(employeeId);
	    }

	    @Test
	    public void testAddAssign() {
	        int employeeId = 1, managerId = 2, courseId = 3;
	        Assign assign = new Assign();
	        Employee employee = new Employee();
	        Course course = new Course();
	        Manager manager = new Manager();
	        Team team = new Team();

	        when(employeeRepository.findById(employeeId)).thenReturn(Optional.of(employee));
	        when(courseRepository.findById(courseId)).thenReturn(Optional.of(course));
	        when(courseRepository.save(course)).thenReturn(course);
	        when(managerRepository.findById(managerId)).thenReturn(Optional.of(manager));
	        when(teamRepository.getTeamId(employeeId)).thenReturn(10);
	        when(teamRepository.findById(10)).thenReturn(Optional.of(team));
	        when(assignRepository.save(assign)).thenReturn(assign);

	        assignService.addAssign(employeeId, managerId, courseId);
	    }

	    @Test
	    public void testGetAssignedEmployeeCourse() {
	        int courseId = 1, employeeId = 2;
	        when(assignRepository.getAssignedEmployeeCourse(courseId, employeeId)).thenReturn(new Assign());
	        assignService.getAssignedEmployeeCourse(courseId, employeeId);
	    }
	}


