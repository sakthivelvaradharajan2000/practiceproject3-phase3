package com.junitspring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;
public class test1 {
	
	@Test
	void checkpassword() {
		users u1 = new users();
		u1.setPassword("a1b2c3");
		assertEquals(u1.getPassword(),"a1b2c3");
	}
	
	@Test
	void checkusername() {
		users u1 =new users();
		u1.setEmail("ABCD");
		assertEquals(u1.getEmail(),"ABCD");
	}
	
	@Test
	void checkbyconstructor() {
		users u1 = new users("DEF", "QWERTY");
		users u2 = new users();
		u2.setEmail("DEF");
		u2.setPassword("QWERTY");
		
		assertEquals(u1.getEmail(),u2.getEmail());
		assertEquals(u1.getPassword(),u2.getPassword());
	}
	
}
