package com.nishant.jobrestspringboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nishant.jobrestspringboot.model.Job;
import com.nishant.jobrestspringboot.repo.JobRepo;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public void addJob(Job job) {
        repo.save(job);
    }

    public List<Job> getAllJobs() {
        return repo.findAll();
    }

    public String[] getAvailableTechStacks() {
        return new String[] { "FIX", "THIS", "IN", "SERVICE" };
        // return repo.getJobTechStack();
    }

    public Job getJob(int jobId) {
        return repo.findById(jobId).orElseThrow();
    }

    public void updateJob(Job updatedJob) {
        repo.save(updatedJob);
    }

    public void deleteJob(int jobId) {
        repo.deleteById(jobId);
    }

    public void load() {
        List<Job> jobs = new ArrayList<>(Arrays.asList(
                new Job(1, "Software Engineer",
                        "Responsible for developing and maintaining software applications.", 3,
                        Arrays.asList("Java", "Spring", "Hibernate")),
                new Job(2, "Data Scientist",
                        "Analyze and interpret complex data to help companies make decisions.", 2,
                        Arrays.asList("Python", "R", "SQL")),
                new Job(3, "Frontend Developer",
                        "Build and maintain user interfaces for web applications.",
                        1,
                        Arrays.asList("JavaScript", "React", "CSS")),
                new Job(4, "Backend Developer",
                        "Develop and maintain server-side logic, database integration, and APIs.", 4,
                        Arrays.asList("Node.js", "Express", "MongoDB")),
                new Job(5, "DevOps Engineer",
                        "Manage and automate the infrastructure and deployment processes.", 5,
                        Arrays.asList("Docker", "Kubernetes", "AWS"))));

        repo.saveAll(jobs);
    }
}
