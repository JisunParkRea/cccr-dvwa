package com.appsecco.dvja.services;

import com.appsecco.dvja.models.User;
import org.junit.Test;
import static org.junit.Assert.*;


public class UserAuthenticationServiceTest {

	@Before
    public void setUp() {
    	UserAuthenticationService u = new UserAuthenticationService();
    }

	@Test
	public void testAuthenticate() {
		String login = "noLogin";
		String password = "noPasswd";

		User user = u.authenticate(login, password);
		assertNull(user);
	}
}