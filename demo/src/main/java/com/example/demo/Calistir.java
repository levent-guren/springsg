package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.repository.PersonelRepository;

@Component
public class Calistir implements CommandLineRunner {
	@Autowired
	private PersonelRepository personelRepository;

	@Override
	public void run(String... args) throws Exception {
		personelRepository.findAll().forEach(System.out::println);
	}

}
