package com.system.LinkSathi.services.user_management.impl;

import com.system.LinkSathi.repo.user_management.UserRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final UserRepo userRepo;


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userRepo.findByEmail(username).orElseThrow(() -> new EntityNotFoundException("User not found."));
    }

}
