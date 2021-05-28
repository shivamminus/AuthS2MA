package com.authorize.main.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.authorize.main.repository.AuthRequestRepo;
import com.authorize.main.service.AuthorizationService;
import com.authorize.main.util.JwtUtil;

class AuthorizationControllerTest {

	@Mock
	private JwtUtil jwtUtil;

	@Mock
	private  AuthorizationService authService;

	@Mock
	private AuthRequestRepo authRequestRepo;

	@Autowired		
	private AuthorizationController authenticationController;
	
	
	
	
//	@Test
//	public void testValidatingAuthorizationToken() {
//		
//		ResponseEntity<VaildatingDTO> validatingAuthorizationToken = authenticationController.validatingAuthorizationToken("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzaGl2YW0iLCJleHAiOjE2MjIxOTk0NTEsImlhdCI6MTYyMjE5NzY1MX0.SJl5OsoAoOnIKhOZr6OXgZiXIgGVOHanlBF_a2wTXto");
//		assertTrue(validatingAuthorizationToken.getBody().isValidStatus());
//		when(authenticationController.verifyToken("token")).thenReturn(new JwtResponse("admin", "adminpass", true));
//	}
	
	@Test
	public void testHealthCheck() {
		ResponseEntity<String> healthCheck = authenticationController.healthCheck();
		assertEquals(HttpStatus.OK, healthCheck.getStatusCode() );
	}
	

//	@Test
//	void testValidLogin() throws LoginException, LoginCredentialNotValid {
//		AuthenticationRequest authenticationRequest = new AuthenticationRequest("adyasha1", "adyasha1");
//		UserDetails userDetails = new User(authenticationRequest.getUserName(), authenticationRequest.getPassword(),
//				new ArrayList<>());
//
//		when(authService.loadUserByUsername("adyasha1")).thenReturn(userDetails);
//		when(jwtUtil.generateToken(userDetails)).thenReturn("dummy-token");
//
//		ResponseEntity<Object> authenticationResponse = authenticationController
//				.createAuthorizationToken(authenticationRequest);
//		assertEquals(HttpStatus.OK, authenticationResponse.getStatusCode());
//	}


//	@Test
//	void testInvalidLogin() {
//		AuthenticationRequest authenticationRequest = new AuthenticationRequest("adyasha1", "abhishek2");
//		UserDetails userDetails = new User(authenticationRequest.getUserName(), "adyasha1", new ArrayList<>());
//		
//		when(authService.loadUserByUsername("adyasha1")).thenReturn(userDetails);
//		Exception exception = Assertions.assertThrows(LoginException.class,
//				() -> authenticationController.createAuthorizationToken(authenticationRequest));
//		assertEquals("Invalid Username or Password", exception.getMessage());
//	}
//
//	@Test
//	void testValidToken() {
//		AuthenticationRequest authenticationRequest = new AuthenticationRequest("adyasha1", "adyasha1");
//		UserDetails userDetails = new User(authenticationRequest.getUserName(), authenticationRequest.getPassword(),
//				new ArrayList<>());
//
//		when(jwtUtil.validateToken("token", userDetails)).thenReturn(true);
//		when(jwtUtil.extractUsername("token")).thenReturn("adyasha1");
//		when(authService.loadUserByUsername("adyasha1")).thenReturn(userDetails);
//
//		ResponseEntity<?> validity = authenticationController.validatingAuthorizationToken("Bearer token");
//		assertTrue(validity.getBody().toString().contains("true"));
//	}
//
//	@Test
//	void testInvalidToken() {
//		AuthenticationRequest authenticationRequest = new AuthenticationRequest("adyasha1", "adyasha1");
//		UserDetails userDetails = new User(authenticationRequest.getUserName(), authenticationRequest.getPassword(),
//				new ArrayList<>());
//
//		when(jwtUtil.validateToken("token", userDetails)).thenReturn(false);
//		when(jwtUtil.extractUsername("token")).thenReturn("adyasha1");
//		when(authService.loadUserByUsername("adyasha1")).thenReturn(userDetails);
//
//		ResponseEntity<?> validity = authenticationController.validatingAuthorizationToken("Bearer token");
//		assertEquals(true, validity.getBody().toString().contains("false"));
//	}
//
//	@Test
//	void testInvalidTokenWhenSignatureInvalid() {
//		AuthenticationRequest authenticationRequest = new AuthenticationRequest("adyasha1", "adyasha1");
//		UserDetails userDetails = new User(authenticationRequest.getUserName(), authenticationRequest.getPassword(),
//				new ArrayList<>());
//
//		when(jwtUtil.validateToken("token", userDetails)).thenThrow(SignatureException.class);
//		when(jwtUtil.extractUsername("token")).thenReturn("adyasha1");
//		when(authService.loadUserByUsername("adyasha1")).thenReturn(userDetails);
//
//		ResponseEntity<?> validity = authenticationController.validatingAuthorizationToken("Bearer token");
//		assertEquals(true, validity.getBody().toString().contains("false"));
//	}
//
}
