package com.example.pss.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.pss.model.Delegation;
import com.example.pss.model.User;

import java.util.List;

@Repository
public interface DelegationRep extends JpaRepository<Delegation, Long> {

    List<Delegation> findAllByUser(User user);

    @Modifying
    @Query(value = "DELETE FROM DELEGATION  WHERE USER_ID = ?1", nativeQuery = true)
    void deleteFrom_DELEGATION_ByUserId(long id);

}