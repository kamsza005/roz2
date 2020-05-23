package com.example.pss.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.pss.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRep extends JpaRepository<User, Long> {

    Optional<User> findById(long id);

    Optional<User> findByName(String name);

    Optional<User> findByEmail(String email);

    List<User> findAllByEmail(String email);
}
