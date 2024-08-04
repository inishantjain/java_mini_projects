package com.nishant.jpademo;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nishant.jpademo.model.Student;
import com.nishant.jpademo.repo.StudentRepo;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpademoApplication.class, args);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		StudentRepo repo = context.getBean(StudentRepo.class);

		s1.setRollNo(29);
		s1.setName("Nishant");
		s1.setMarks(85);

		s2.setRollNo(43);
		s2.setMarks(77);
		s2.setName("Trishank");

		s3.setRollNo(42);
		s3.setMarks(80);
		s3.setName("Sumit");

		repo.save(s3);
		// Optional<Student> s = repo.findById(28);
		// System.out.println(s.isEmpty() ? "No Student Found" : s.get());

		List<Student> students = repo.findByName("Nishant");
		System.out.println(students);
	}

}
