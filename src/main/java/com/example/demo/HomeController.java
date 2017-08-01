package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String index(Model model)
    {
        model.addAttribute("message", "Fill your details");
        Student mystudent = new Student();
        model.addAttribute("student" , mystudent);
        return "home";
    }

    @RequestMapping("/processform")
    public String getform(@ModelAttribute Student newstudent)
    {
        String test = newstudent.getFname();
        return "home";
    }
}
