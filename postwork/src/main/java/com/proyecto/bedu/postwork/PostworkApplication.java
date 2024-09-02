package com.proyecto.bedu.postwork;

import model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PostworkApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PostworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner data = new Scanner(System.in);
		System.out.println("Introduce the name of person and age:  ");
		String name = data.nextLine();
		int age = data.nextInt();

		Person person = new Person(name, age);
		System.out.println("Name: "+person.getName()+" Age: "+person.getAge());

	}
}
