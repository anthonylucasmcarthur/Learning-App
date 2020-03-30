package dev.learning;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.learning.entities.Student;
import dev.learning.repositories.StudentRepo;

@SpringBootTest
class LeariningAppApplicationTests {

	@Autowired
	StudentRepo sr;
	
	@Test
	void contextLoads() {
		Student student = sr.findByid(1);
		System.out.println(student);
	}

}
