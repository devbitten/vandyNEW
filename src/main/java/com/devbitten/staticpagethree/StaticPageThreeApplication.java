package com.devbitten.staticpagethree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import hello.Customer;
//import hello.CustomerRepository;

@SpringBootApplication
public class StaticPageThreeApplication {
	/*
}
	@Autowired
	private CustomerRepository repository;
	*/
	public static void main(String[] args) {
		SpringApplication.run(StaticPageThreeApplication.class, args);
	}
	
	/*
	public void run(String... args) throws Exception {

		//repository.deleteAll();

		// save a couple of customers
		repository.save(new Account("Alice", "Smith"));
		repository.save(new Account("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Account account : repository.findAll()) {
			System.out.println(account);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Account account : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}
		*/
}
