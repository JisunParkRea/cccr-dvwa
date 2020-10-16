package com.appsecco.dvja.services;

import org.junit.Test;
import static org.junit.Assert.*;


public class UserAuthenticationServiceTest {
	@Test
	public void testAuthenticate() {
		UserAuthenticationService u = new UserAuthenticationService();
		User user = u.authenticate('noLogin', 'noPassword');
		assertEquals(null, user, 0);
	}
}