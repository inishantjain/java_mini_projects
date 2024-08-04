package com.nishant.jobrestspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.nishant.jobrestspringboot.model.Job;
import com.nishant.jobrestspringboot.service.JobService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin(origins = "http:localhost:3000/")
public class JobController {
    @Autowired
    private JobService service;

    @GetMapping("/")
    // @ResponseBody
    public String getHello() {
        System.out.println("/////////////////////////hello ROUTE HIT//////////////////////////");
        return "Hello";
    }

    @GetMapping("/allJobs")
    // @ResponseBody // response body is needed to tell our app that we are
    // returning data and not the view, however a RestController doesn't require
    // response body
    public List<Job> getAllJobs() {
        System.out.println("/////////////////////////getAllJobs ROUTE HIT//////////////////////////");
        return service.getAllJobs();
    }

    @GetMapping("/job/{jobId}")
    public Job getJob(@PathVariable("jobId") int jobId) {// we can remove the argument postId from pathVariable if it
                                                         // is same as parameter of function
        return service.getJob(jobId);
    }

    @PostMapping("/job")
    public void addJob(@RequestBody Job job) {
        service.addJob(job);
    }

    @PutMapping("job/{jobId}")
    public Job updateJobPost(@PathVariable int jobId, @RequestBody Job updateJobDto) {
        service.updateJob(updateJobDto);
        return service.getJob(jobId);
    }

    @DeleteMapping("job/{jobId}")
    public String deleteJob(@PathVariable int jobId) {
        service.deleteJob(jobId);
        return "delete success";
    }

    // Seed the db by running this endpoint
    @GetMapping("load")
    public String loadData() {
        service.load();
        return "success";
    }

}
