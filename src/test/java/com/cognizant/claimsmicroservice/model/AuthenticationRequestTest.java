package com.cognizant.claimsmicroservice.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 
 * This class contains test cases for the AuthenticationRequest model class
 * which are written using junit
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class AuthenticationRequestTest {

	@Mock
	public AuthenticationRequest authenticationRequest;

	/**
	 * 
	 * test the AuthenticationRequest is not null
	 */

	@Test
	@DisplayName("Checking if AuthenticationRequest class is loading or not.")
	void AuthentictionRequestIsLoadedOrNot() {
		assertThat(authenticationRequest).isNotNull();
	}

	/**
	 * 
	 * test the AuthenticationRequest all argsConstructor
	 */

	@DisplayName("Checking if AuthenticationRequest class is responding correctly or not.")
	@Test
	void testingAuthenticationRequest() {
		authenticationRequest = new AuthenticationRequest("ramya", "ramya");
		authenticationRequest.setUsername("admin");
		authenticationRequest.setPassword("admin");

		assertEquals("admin", authenticationRequest.getUsername());
		assertEquals("admin", authenticationRequest.getPassword());
	}

	/**
	 * 
	 * test the AuthenticationRequest no argsConstructor
	 */

	@Test
	public void testNoArgConstructor() {
		AuthenticationRequest ulc = new AuthenticationRequest();
		assertEquals(ulc, ulc);
	}
}
