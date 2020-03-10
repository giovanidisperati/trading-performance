package com.tradingperformance.tradingperformance.Resources;

import com.tradingperformance.tradingperformance.Entities.User;
import com.tradingperformance.tradingperformance.Repositories.UserRepositoryInterface;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    UserRepositoryInterface userRepository;

    @PostMapping
    public ResponseEntity store(@RequestBody User user) {
        try {
            userRepository.save(user);
   			return new ResponseEntity(user, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
