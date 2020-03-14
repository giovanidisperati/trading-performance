package com.tradingperformance.tradingperformance.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.annotation.PostConstruct;
import java.util.Base64;
import java.util.List;

public class JwtTokenProvider {

    @Value("${security.jwt.token.secret-key:secret}")
    private String secret = "secret";

    @Value("${security.jwt.token.expire-length:3600000}")
    private long validityInMilliseconds = 3600000; //1 hour

    @Autowired
    private UserDetailsService userDetailsService;

    @PostConstruct
    public void init() {
        secretkey = Base64.getEncoder().encodeToString(secret.getBytes());
    }

    public String createToken(String username, List<String> roles) {


        return "ola";
    }

}
