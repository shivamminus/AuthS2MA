package com.authorize.main.abcd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;

import com.authorize.main.controller.AuthorizationController;
//import com.authorize.main.controller.JwtResponse;
import com.authorize.main.dto.VaildatingDTO;

class AkshayKatest {


//	@Autowired		
	AuthorizationController authenticationController = new AuthorizationController();
	
	@Test
	void test() {
		assertTrue(true);
	}
	
	
	
	
	@Test
	public void testHealthCheck() {
//		assertTrue(true);
		ResponseEntity<String> healthCheck = authenticationController.healthCheck();
		assertEquals(HttpStatus.OK, healthCheck.getStatusCode() );
	}
	
	@Test
	public void testValidatingAuthorizationToken() {
		String token = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzaGl2YW0iLCJleHAiOjE2MjIyMDU4NzAsImlhdCI6MTYyMjIwNDA3MH0.Biv6hI0u4XJAdntysV-biA2_m0Gpv89-okYRZlhvqWU";
		
		ResponseEntity<VaildatingDTO> validatingAuthorizationToken = authenticationController.validatingAuthorizationToken(token);
		System.out.println(validatingAuthorizationToken);
		assertTrue(validatingAuthorizationToken.getBody().isValidStatus());
	}
	

}
