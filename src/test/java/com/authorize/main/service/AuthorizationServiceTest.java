package com.authorize.main.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import com.authorize.main.model.AuthenticationRequest;
import com.authorize.main.repository.AuthRequestRepo;

class AuthorizationServiceTest {

	@MockBean
    private AuthRequestRepo userRepo;

    @Autowired
    private AuthorizationService userService;

    @Test
    void testloadUserByUsername() {
        AuthenticationRequest user = new AuthenticationRequest("admin", "admin");
        when(userRepo.findById("admin")).thenReturn(Optional.of(user));
        UserDetails userDetails = new User("admin", "admin", new ArrayList<>());
        assertEquals(userDetails, userService.loadUserByUsername("admin"));
    }

    @Test
    @DisplayName("Checking for AppUserDetailsService - if it is loading or not")
    public void appUserDetailsServiceNotNullTest() {
        assertThat(userService).isNotNull();
    }

}
