package com.tradingperformance.tradingperformance.Repositories;

import com.tradingperformance.tradingperformance.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepositoryInterface extends JpaRepository<User, Long> {

    @Query("SELECT  u from User u where u.userName =:userName")
    User findByUsername(@Param("userName") String userName);
}
