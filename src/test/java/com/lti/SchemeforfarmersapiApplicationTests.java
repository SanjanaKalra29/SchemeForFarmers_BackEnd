package com.lti;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.lti.controller.UserController;
import com.lti.controller.UserController.Status;
import com.lti.entity.User;
import com.lti.repository.UserRepository;
import com.lti.service.UserService;

@SpringBootTest
//@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)

class SchemeforfarmersapiApplicationTests {
	
	@Autowired
	//private UserRepository userRepo;
	//private UserService userServ;
	private UserController cntr;
	
	@Test
	void add() {
		
	User u = new User();
	
	Status s = new Status();
		
		u.setId(42);
		u.setFirstname("Amit");
		u.setLastname("Patel");
		u.setRole("Farmer");
		u.setDob(LocalDate.of(1981, 1, 31));
		u.setEmail("ami.patel@li");
		u.setPhoneno(90261689);
		u.setGender("Male");
		u.setPassword("12345");
		u.setAddress("abc nagar");
		u.setAadharcard(1212125);
		u.setUsername("amit");
		u.setPassword("Amit@123");
		u.setPancard("AE123123");
		s = cntr.register(u);
        System.out.println(s.getStatus());
        //System.out.println(s.getMessage());
        
		
	}
	
	/*@Test
	void add() {
	//Service testing	
		User u = new User();
		
		u.setId(40);
		u.setFirstname("Amit");
		u.setLastname("Patel");
		u.setRole("Farmer");
		u.setDob(LocalDate.of(1981, 1, 31));
		u.setEmail("amt@li");
		u.setPhoneno(90261689);
		u.setGender("Male");
		u.setPassword("12345");
		u.setAddress("abc nagar");
		u.setAadharcard(1212125);
		u.setUsername("amit");
		u.setPassword("Amit@123");
		u.setPancard("AE123123");
		
		userServ.register(u);
		
	}
	
	/*@Test
	void Add() {
		User u = new User();
		u.setId(36);
		u.setFirstname("Amit");
		u.setLastname("Patel");
		u.setRole("Farmer");
		u.setDob(LocalDate.of(1981, 1, 31));
		u.setEmail("amit@lti");
		u.setPhoneno(90261689);
		u.setGender("Male");
		u.setPassword("12345");
		u.setAddress("abc nagar");
		u.setAadharcard(12112125);
		u.setUsername("amit");
		u.setPassword("Amit@123");
		u.setPancard("AE123123");
		userRepo.save(u);

}
	@Test
	void findid() {
		int id =userRepo.findByEmailAndPass("amit@ltiii", "Amit@123");
		System.out.println("id -" + id);
	}   */
	
	
	
}
