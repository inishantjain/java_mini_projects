package com.nishant.springmvcdemo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller //behind the seen it automatically converted into servlets by spring boot
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("//////////////Home controller callled/////////////");
        return "index";//index.jsp converted to html using the tomcat-jasper
    }


    //accessing data the servlet way
    /*@RequestMapping("/save")
    public String save(HttpServletRequest req, HttpSession session){
        System.out.println("Save method called");
        String name = req.getParameter("name");
        String email = req.getParameter("email");

        session.setAttribute("name", name);
        session.setAttribute("email", email);
        return "details.jsp";
    }  */

    //accessing data in easy way
    /*@RequestMapping("/save")
    public String save(@RequestParam("name") String name, @RequestParam("email") String email, Model model){
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "details";//returns details jsp in the locations defined in application.properties file
    }*/

    /*@RequestMapping("/addUser")
    public ModelAndView addUser(@RequestParam("name") String name, @RequestParam("email") String email, ModelAndView mv){
        User user = new User();
        user.setName(name);user.setEmail(email);
        mv.addObject("user", user);
//        mv.addObject("name", name);
//        mv.addObject("email", email);
        mv.setViewName("details");//describe your jsp file name

        return mv;
    } */

    @RequestMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user){ //model attribute assigns data coming to an object and set attribute to user variable used in jsp file(model attribute annotation is optional as our attribute and parameter having same name)
        System.out.println(user);
        return "details";
    }

    @ModelAttribute("course")//this is a model attribute and can be used in jsp file of our project
    public String courseName(){
        return "JavaSpringBoot3";
    }
}
