package com.shoes_store.lenhan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shoes_store.lenhan.model.account;

public interface accountRepository extends JpaRepository<account, Integer>{
//	Optional<account> findByUsername(String username);
	@Query("select t from account t where t.username = :username")
	Optional<account> findByUsername(@Param("username") String username);
    
    Boolean existsByUsername(String username);
}
