package com.slci.sticket.user.dao;

import com.slci.sticket.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
