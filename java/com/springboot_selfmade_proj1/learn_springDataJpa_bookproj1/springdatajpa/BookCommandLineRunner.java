package com.springboot_selfmade_proj1.learn_springDataJpa_bookproj1.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jakarta.persistence.PersistenceContext;

@Component
public class BookCommandLineRunner implements CommandLineRunner{

	@Autowired
	private BookSpringDataJpaRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Book(1,"The Fault in Our Stars","John Green",350));
		repository.save(new Book(2,"The Seven Husbands of Evelyn Hugo","Taylor Reid",275));
		repository.save(new Book(3,"To All the Boys I've Loved Before","Jenny Han",374));
		repository.save(new Book(4,"A Thousand Splendid Suns","Khaled Hosseini",172));
		repository.save(new Book(5,"The Silent Patient","JAlex Michaelides",158));
		repository.save(new Book(6,"Something I Never Told You","Shravya Bhinder",202));
		repository.save(new Book(7,"The Boy with A Broken Heart","Durjoy Datta",239));
		repository.save(new Book(8,"THE PROMISE","Nikita Singh",237));
		repository.save(new Book(9,"The Summer I Turned Pretty","Jenny Han",292));
		repository.save(new Book(10,"The Perfect Us","Durjoy Datta",345));
		
		repository.deleteById(1l);
		System.out.println(repository.findById(3l));
		
	}

	
	
}
