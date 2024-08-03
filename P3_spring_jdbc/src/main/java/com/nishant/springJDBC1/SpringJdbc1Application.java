package com.nishant.springJDBC1;

import com.nishant.springJDBC1.model.Student;
import com.nishant.springJDBC1.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbc1Application.class, args);

		Student s = context.getBean(Student.class);
//		s.setRollNo(29);s.setName("Nishant");s.setMarks(80);
//		System.out.println(s);
//
		StudentService service = context.getBean(StudentService.class);
//		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);

	}

}
