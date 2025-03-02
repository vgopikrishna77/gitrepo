package com.mphasis.elearning.servicetest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mphasis.eLearning.entity.User;
import com.mphasis.eLearning.repository.UserRepository;
import com.mphasis.eLearning.service.UserService;

@ExtendWith(SpringExtension.class)
public class UserServiceTest {
@InjectMocks
private UserService userService;
@Mock
private UserRepository userRepository;

/*
 * @BeforeAll public void setup() { MockitoAnnotations.openMocks(userService); }
 */
private List<User> validate() {
	String email="vgopikrishna77@gmail.com";
	String password="Vgopikrishna@77";
	User u=new User();
	u.setEmail(email);
	u.setPassword(password);
	u.setRole("admin");
	u.setUserId(1);
	List<User> u1=new ArrayList<>();
	u1.add(u);
	return u1;
}
@Test
public void validateTestUser() {
	when(userRepository.Validate(any(), any())).thenReturn(validate().get(0));
	userService.validate(any(), any());
}
}
