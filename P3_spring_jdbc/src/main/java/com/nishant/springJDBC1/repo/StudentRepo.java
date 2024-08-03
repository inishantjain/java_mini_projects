package com.nishant.springJDBC1.repo;

import com.nishant.springJDBC1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql = "insert into student (rollno, name, marks) values (?, ?, ?)";
        int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println("✅ Added Student: "+s.getName()+", 💻 Rows Effected: "+rows);
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";
        RowMapper<Student> mapper = (ResultSet rs, int rowNum) -> {
                Student s = new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            };

        return jdbc.query(sql, mapper);
    }
}
