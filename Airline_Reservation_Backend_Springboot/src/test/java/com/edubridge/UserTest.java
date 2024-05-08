package com.edubridge;
import com.edubridge.entity.User;
import com.edubridge.service.UserService;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class UserTest {
	
	@Autowired
    private UserService userService;
	static User user;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		user=new User();
		user.setUsername("sha09");
		user.setName("Shanthal Rose");
		user.setMobile("908976543");
		user.setAddress("chennai");
		user.setPincode("60000");
		user.setPassword("Sh@nthal09");
		user.setRole("admin");
	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void test() {
		assertNotNull(userService.create(user));
	}

	@Test
	void getAllUserTest() {
		assertNotNull(userService.getAllUsers());
	}
}
