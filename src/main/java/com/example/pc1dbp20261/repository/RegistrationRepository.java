package com.example.pc1dbp20261.repository;

import jakarta.servlet.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    boolean existsByUserAndTicketTypeId(Long userId), Long ticketTypedId);

    List <Registration> find ByUserId(Long userId);

}



