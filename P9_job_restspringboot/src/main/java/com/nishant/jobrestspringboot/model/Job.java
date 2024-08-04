package com.nishant.jobrestspringboot.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//these lombok annotations helps to reduce number of lines of code, we don't need to explicitly create constructors, getters and setters here
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {
    @Id
    private int jobId;
    private String jobProfile;
    private String jobDesc;
    private int reqExperience;
    private List<String> jobTechStack;
}
