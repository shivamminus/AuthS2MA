package com.authorize.main.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class AuthenticationResponseTest {

	@Autowired
	   private AuthenticationResponse authenticationResponse;

	   @Test
	   @DisplayName("Checking for AuthenticationResponse - if it is loading or not")
	   public void authenticationResponseNotNullTest(){
	       assertThat(authenticationResponse).isNull();
	   }

}
