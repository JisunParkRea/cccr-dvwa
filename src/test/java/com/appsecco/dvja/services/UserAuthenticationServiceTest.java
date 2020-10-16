package com.appsecco.dvja.services;

import com.appsecco.dvja.models.User;
import org.junit.Test;
import static org.junit.Assert.*;


public class UserAuthenticationServiceTest {

	@Test
	public void testAuthenticate() {
		UserAuthenticationService u = new UserAuthenticationService();

		String login = "son";
		String password = "dkagh1.";

		User user = u.authenticate(login, password);
		assertNull(user);
	}
}