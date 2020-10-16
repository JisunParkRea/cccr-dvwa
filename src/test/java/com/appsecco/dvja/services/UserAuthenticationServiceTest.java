package com.appsecco.dvja.services;

import org.junit.Test;
import static org.junit.Assert.*;


public class UserAuthenticationServiceTest {

	@Test
	public void testAuthenticate() {
		UserAuthenticationService u = new UserAuthenticationService();

		String login = "noLogin";
		String password = "noPassword"
		
		User user = u.authenticate(login, password);
		assertEquals(null, user, 0);
	}
}