package com.ankush.springboot.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class Course {

	@Id
	private int id;
	
	//@Column(name = "name")
	private String name;
	
	//@Column(name = "author")
	private String author;

}
