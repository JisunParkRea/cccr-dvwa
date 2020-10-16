// package com.appsecco.dvja.controllers;

// import org.junit.*;
// import static org.junit.Assert.*;

// import com.appsecco.dvja.models.User;
// import com.appsecco.dvja.services.UserAuthenticationService;
// import org.apache.commons.lang.StringUtils;


// public class LoginTest {
// 	UserAuthenticationService userAuthenticationService;
	
// 	private static final String TEST_LOGIN = "noLogin";
// 	private static final String TEST_PASSWD = "noPasswd";


// 	UserAuthenticationService u;

// 	@Before
//     public void setUp() {
//     	u = new UserAuthenticationService();
//     }

// 	@Test
// 	public void testAuthenticate() {
// 		String login = "noLogin";
// 		String password = "noPasswd";

// 		User user = u.authenticate(login, password);
// 		assertNull(user);
// 	}
// }