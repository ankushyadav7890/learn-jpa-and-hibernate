package com.ankush.springboot.course.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ankush.springboot.course.Course;
import com.ankush.springboot.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	// @Autowired
	// private CourseSpringJdbcRespository repository;

	// @Autowired
	// private CourseJpaRespository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Spring JDBC repository.insert(new Course(1, "Learn Java Now!","Ankush"));
		 * repository.insert(new Course(2, "Learn Springboot Now!","Ankush"));
		 * repository.insert(new Course(3, "Learn Microservics Now!","Ankush"));
		 * 
		 * repository.deleteById(3);
		 * 
		 * System.out.println(repository.findById(1));
		 * System.out.println(repository.findById(2));
		 */

		/*
		 * JPA repository.insert(new Course(1, "Learn Java Now!","Ankush"));
		 * repository.insert(new Course(2, "Learn Springboot Now!","Ankush"));
		 * repository.insert(new Course(3, "Learn Microservics Now!","Ankush"));
		 * 
		 * repository.deleteById(3); 
		 * System.out.println(repository.findById(1));
		 * System.out.println(repository.findById(2));
		 * System.out.println(repository.findById(3));
		 */

		repository.save(new Course(1, "Learn Java Now!", "Ankush"));
		repository.save(new Course(2, "Learn Springboot Now!", "Ankush"));
		repository.save(new Course(3, "Learn Microservics Now!", "Ankush"));
		
		//repository.deleteById(3); 
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(2));
		
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Ankush"));
		System.out.println(repository.findByAuthor(""));
		System.out.println(repository.findByName("Learn Microservics Now!"));

	}

}
