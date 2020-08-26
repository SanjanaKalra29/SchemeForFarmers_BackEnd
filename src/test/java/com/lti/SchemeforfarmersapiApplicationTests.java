package com.lti;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lti.dto.RegisterDto;
import com.lti.entity.User;
import com.lti.repository.UserRepository;
import com.lti.service.UserService;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)

class SchemeforfarmersapiApplicationTests {

	@Autowired
	private UserService userServ;
	@Autowired
	private UserRepository userRepo;

	@Test
	void addUser() {

		RegisterDto regdto = new RegisterDto();

		User u = new User();
		u.setId(40);

//
//		User u = new User();
//
//		u.setId(40);
//		u.setFirstname("Amit");
//		u.setLastname("Patel");
//		u.setRole("Farmer");
//		u.setDob(LocalDate.of(1981, 1, 31));
//		u.setEmail("amt@li");
//		u.setPhoneno(90261689);
//		u.setGender("Male");
//		u.setPassword("12345");
//		u.setAddress("abc nagar");
//		u.setAadharcard(1212125);
//		u.setUsername("amit");
//		u.setPassword("Amit@123");
//		u.setPancard("AE123123");
//
//		userServ.register(u);
//
//		User SavedUser = userRepo.findbyId(u.getId());
//		assertThat(SavedUser).isNotNull();
	}

	@Test
	void loginUser() {
		User SavedUser = userServ.login("amt@li", "Amit@123");
		assertThat(SavedUser).isNotNull();
	}
}
