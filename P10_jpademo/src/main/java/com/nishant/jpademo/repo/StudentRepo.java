package com.nishant.jpademo.repo;

import org.springframework.stereotype.Repository;

import com.nishant.jpademo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

//second generic is our ID or primary key
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    @Query("select s from Student s where s.name = ?1") // JPQL //code still works if this query annotation is not
                                                        // specified
    List<Student> findByName(String name);
}
