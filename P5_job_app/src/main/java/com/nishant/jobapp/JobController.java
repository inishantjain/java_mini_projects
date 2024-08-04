package com.nishant.jobapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import com.nishant.jobapp.model.JobPost;
import com.nishant.jobapp.service.JobService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobController {
    @Autowired
    private JobService service;

    @GetMapping({ "/", "home" })
    public String home() {
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(Model m) {
        String[] availableTechStacks = service.getAvailableTechStacks();
        m.addAttribute("availableTechStacks", availableTechStacks);
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String getMethodName(Model m) {
        List<JobPost> jobPosts = service.getAllJobs();
        m.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }

}