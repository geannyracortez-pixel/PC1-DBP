package com.example.pc1dbp20261.repository;

import com.example.pc1dbp20261.entity.user;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<user, Long> {
    Optional<User> findByEmail(String Email);
    boolean existsByEmail(String email);

}
