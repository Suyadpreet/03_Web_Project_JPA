package com.suyad.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suyad.Binding.Student;
import com.suyad.Entity.Students;
import com.suyad.Repo.studentRepo;

@Service
public class StudentService
{
	
	@Autowired
	studentRepo r;
	public List<String> getcourses()
	{
		return Arrays.asList("java","python","Devops","MEAN");
	}
	public List<String> checkboxes()
	{
		return Arrays.asList("Dawn","Afternoon","Dust","Night");
	}
	public List<String> Genders()
	{
		return Arrays.asList("Male","Female");
	}
	public boolean saveStudent(Student std)
	{
		Students s = new Students();
		BeanUtils.copyProperties(std, s);
		s.setTiming(Arrays.toString(std.getTiming()));
		System.out.println(s);
		r.save(s);
		return true;
	}
	public List<Students> getAlldetails()
	{
		List<Students> findAll = r.findAll();
		String s1[] = findAll.get(0).getTiming().split(",");
		System.out.println(s1[0]+" "+s1[1]);
		return findAll;
		
	}
	
}
