package com.shoes_store.lenhan.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shoes_store.lenhan.model.brand;

public interface brandRepository extends JpaRepository<brand, Integer>{
	
	@Query("select u from brand u where u.id = ?1")
	Optional<brand> findById(Integer id);
	
//	@Modifying
//	@Query("delete from brand u where u.id=:id")
//	void deleteBrand(@Param("id")Integer id);
	
	void deleteById(Integer id);
}
