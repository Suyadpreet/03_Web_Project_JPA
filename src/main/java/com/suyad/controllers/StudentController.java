package com.suyad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.suyad.Binding.Student;
import com.suyad.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	StudentService service;
	public StudentController() 
	{
		System.out.println("Constructor of Student Controller class called........");
	}
	
	@GetMapping("/")
	public String indexpage(Model m)
	{	
		formBindingData(m);
		return "index";
	}

	private void formBindingData(Model m) 
	{
		m.addAttribute("stds", new Student());
		m.addAttribute("crs", service.getcourses());
		m.addAttribute("tmg", service.checkboxes());
		m.addAttribute("gnd", service.Genders());
	}
	
	@PostMapping("/save")
	public String firstpage(Student stdsd,Model m)
	{
		m.addAttribute("msg", "Data Saved Successfully");
		formBindingData(m);
		//System.out.println(s);
		boolean saveStudent = service.saveStudent(stdsd);
		System.out.println(saveStudent);
		return "index";
	}
	

}
