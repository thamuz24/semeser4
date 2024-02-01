package com.exam_1.controller;

import com.exam_1.model.Class;
import com.exam_1.model.Student;
import com.exam_1.service.impl.ClassService;
import com.exam_1.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassService classService;

    @GetMapping("")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/student/list");
        modelAndView.addObject("studentList", studentService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createForm() {
        ModelAndView modelAndView = new ModelAndView("/student/create");
        modelAndView.addObject("student", new Student());
        Iterable<Class> classList = classService.findAll();
        modelAndView.addObject("classList", classList);
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute Student aClass) {
        ModelAndView modelAndView = new ModelAndView("haha");
        studentService.save(aClass);
        modelAndView.addObject("student", new Student());
        modelAndView.addObject("message", "student created!");
        return modelAndView;
    }

    @GetMapping("/update/{id}")
    public ModelAndView update(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/student/update");
        Student student = studentService.findById(id).get();
        modelAndView.addObject("student", student);
        modelAndView.addObject("classList", classService.findAll());
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView Update(@ModelAttribute Student student) {
        ModelAndView modelAndView = new ModelAndView("/student/update");
        studentService.save(student);
        modelAndView.addObject("student", student);
        modelAndView.addObject("classList", classService.findAll());
        modelAndView.addObject("message", "student updated!");
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView view(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/student/view");
        Student student = studentService.findById(id).get();
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteAlert(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/student/delete");
        Student student = studentService.findById(id).get();
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @GetMapping("/delete/{id}/yes")
    public String delete(@PathVariable Long id) {
        Student student = studentService.findById(id).get();
        studentService.delete(student);
        return "redirect:/students";
    }

}
