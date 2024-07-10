package com.ankush.springboot.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankush.springboot.course.Course;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Integer> {

	public List<Course> findByAuthor(String string);
	public List<Course> findByName(String string);

}
