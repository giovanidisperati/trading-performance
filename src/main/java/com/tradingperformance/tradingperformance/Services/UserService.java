package com.tradingperformance.tradingperformance.Services;

import com.tradingperformance.tradingperformance.Repositories.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepositoryInterface userRepository;


}
