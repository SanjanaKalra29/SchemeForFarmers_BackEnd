package com.lti;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lti.entity.User;
import com.lti.repository.UserRepository;

@SpringBootTest
//@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)

class SchemeforfarmersapiApplicationTests {
	
	@Autowired
	private UserRepository userRepo;
	
	@Test
	void Add() {
		User u = new User();
		u.setFirstname("Amit");
		u.setLastname("Patel");
		u.setRole("Farmer");
		u.setDob(LocalDate.of(1981, 1, 31));
		u.setEmail("amit@lti");
		u.setPhoneno("9026168950");
		u.setGender("Male");
		u.setPassword("12345");
		u.setAddress("abc nagar");
		u.setAadharcard(12121212);
		u.setUsername("amit");
		u.setPassword("Amit@123");
		u.setPancard("AE123123");
		userRepo.save(u);

}
}
