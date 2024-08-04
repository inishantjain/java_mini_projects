package com.nishant.jobapp.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nishant.jobapp.model.JobPost;

@Repository
public class JobRepo {
        private static String[] availableTechStacks = { "Java", "Python", "JavaScript", "C#", "C++", "PHP", "Swift",
                        "Kotlin", "Ruby", "Go", "R", "TypeScript", "SQL", "NoSQL", "HTML", "React", "Angular", "Vue.js",
                        "Node.js", "Spring Boot", "Django", "Flask", "ASP.NET", "Laravel", "TensorFlow", "PyTorch",
                        "Keras", "Hadoop", "Spark", "Kafka", "Docker", "Kubernetes", "AWS", "Azure", "Google Cloud",
                        "Salesforce", "Tableau", "Power BI", "Selenium", "Git", "Jenkins", "Terraform" };

        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                        new JobPost(1, "Software Engineer",
                                        "Responsible for developing and maintaining software applications.", 3,
                                        Arrays.asList("Java", "Spring", "Hibernate")),
                        new JobPost(2, "Data Scientist",
                                        "Analyze and interpret complex data to help companies make decisions.", 2,
                                        Arrays.asList("Python", "R", "SQL")),
                        new JobPost(3, "Frontend Developer", "Build and maintain user interfaces for web applications.",
                                        1,
                                        Arrays.asList("JavaScript", "React", "CSS")),
                        new JobPost(4, "Backend Developer",
                                        "Develop and maintain server-side logic, database integration, and APIs.", 4,
                                        Arrays.asList("Node.js", "Express", "MongoDB")),
                        new JobPost(5, "DevOps Engineer",
                                        "Manage and automate the infrastructure and deployment processes.", 5,
                                        Arrays.asList("Docker", "Kubernetes", "AWS"))));

        public List<JobPost> getAllJobs() {
                return jobs;
        }

        public void addJob(JobPost job) {
                jobs.add(job);
        }

        public String[] getAvailableTechStacks() {
                return availableTechStacks;
        }
}
