package com.nishant.job_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class JobController {
    
    @RequestMapping({"/", "/home"})
    public String home(){
        System.out.println("///////////////////////////homehit//////////////////////////////");
        return "home";
    }
    
    @RequestMapping("/addjob")
    public String addJob() {
        System.out.println("///////////////////////////addjobhit//////////////////////////////");
        return "addjob";
    }
    
}
