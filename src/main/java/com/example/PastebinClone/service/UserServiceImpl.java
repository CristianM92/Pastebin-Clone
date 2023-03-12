package com.example.PastebinClone.service;

import com.example.PastebinClone.dto.UserRegistrationDTO;
import com.example.PastebinClone.repository.UserRepository;
import com.example.PastebinClone.security.SecurityUserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;

    public UserServiceImpl(UserRepository userRepo) {
        super();
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User is not found!");
        }
        return new SecurityUserDetails(user);
    }

    @Override
    public User save(UserRegistrationDTO registrationDTO) {
        return null;
    }
}
