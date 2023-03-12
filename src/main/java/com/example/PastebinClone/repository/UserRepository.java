package com.example.PastebinClone.repository;

import com.example.PastebinClone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    org.springframework.security.core.userdetails.User findByUsername(String username);
}
