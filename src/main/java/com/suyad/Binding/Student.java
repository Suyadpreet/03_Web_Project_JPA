package com.suyad.Binding;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Student
{
	private String name;
	private String email;
	private String gender;
	private String courses;
	private String timing[];
}
