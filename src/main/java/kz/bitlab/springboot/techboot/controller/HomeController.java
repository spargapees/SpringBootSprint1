package kz.bitlab.springboot.techboot.controller;

import kz.bitlab.springboot.techboot.db.DBManager;
import kz.bitlab.springboot.techboot.db.Music;
import kz.bitlab.springboot.techboot.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value="/")
    public String indexPage(Model model){
        ArrayList<Student> studentArrayList = DBManager.getStudents();
        model.addAttribute("studentArrayList", studentArrayList);
        return "index";
    }

    @GetMapping(value = "/add-student")
    public String StudentPage(){
        return "add_student";
    }

    @GetMapping(value="/about")
    public String aboutPage(){
        return "about_page";
    }

    @PostMapping(value = "/add-student")
    public String addStudent(Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }


}
