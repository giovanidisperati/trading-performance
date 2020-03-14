package com.tradingperformance.tradingperformance.Services;

import com.tradingperformance.tradingperformance.Entities.User;
import com.tradingperformance.tradingperformance.Repositories.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepositoryInterface userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if(user != null) {
            return user;
        } else {
            throw new UsernameNotFoundException("User not found.");
        }
    }
}
