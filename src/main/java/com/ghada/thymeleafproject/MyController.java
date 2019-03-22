package com.ghada.thymeleafproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    public List<Student> students= new ArrayList<>();
    public MyController(){
        students.add(new Student("ghadaa","amri","group 3"));
       // students.add(new Student("ghadaa","amri","group 4"));
        //students.add(new Student("ghadaa","amri","group 2"));
    }

    @RequestMapping(value = "/")
    public String index(Model model){
        return "index";
    }
    @RequestMapping(value = "/PersonList")
    public String listStudent(Model model){
        model.addAttribute("students",students);
        return "PersonList";
    }
    @RequestMapping(value="/addPerson" , method= RequestMethod.GET)
    public String addPerson( Model model){
        return "addPerson";
    }
    @RequestMapping(value="/addPerson" , method= RequestMethod.POST)
    public String savePerson(Model model , @ModelAttribute("studentForm")StudentForm studentForm){
        String name=studentForm.getName();
        String lastname=studentForm.getLastname();
        String group=studentForm.getGroup();
        students.add( new Student(name,lastname,group));

        return "redirect:/PersonList";
    }

}
