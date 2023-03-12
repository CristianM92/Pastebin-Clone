package com.example.PastebinClone.service;

import com.example.PastebinClone.dto.UserRegistrationDTO;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

     User save(UserRegistrationDTO registrationDTO);
}
