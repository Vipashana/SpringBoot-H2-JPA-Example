package com.springboot_selfmade_proj1.learn_springDataJpa_bookproj1.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookSpringDataJpaRepository extends JpaRepository<Book, Long>{

	List<Book> findById(long Id);
	
}
