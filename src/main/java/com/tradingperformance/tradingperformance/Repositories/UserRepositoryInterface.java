package com.tradingperformance.tradingperformance.Repositories;

import com.tradingperformance.tradingperformance.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<User, Long> {
}
