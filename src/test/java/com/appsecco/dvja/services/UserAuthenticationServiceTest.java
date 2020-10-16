package com.appsecco.dvja.services;

import com.appsecco.dvja.models.User;
import org.junit.*;
import static org.junit.Assert.*;


public class UserAuthenticationServiceTest {
	UserAuthenticationService u;

	@Before
    public void setUp() {
    	u = new UserAuthenticationService();
    	u.setUserService(u);
    }

	@Test
	public void testAuthenticate() {
		String login = "noLogin";
		String password = "noPasswd";

		User user = u.authenticate(login, password);
		assertNull(user);
	}
}