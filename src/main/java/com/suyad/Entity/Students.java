package com.suyad.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Component
public class Students 
{
	@Id
	@GeneratedValue
	private Integer sid;
	private String name;
	private String email;
	private String gender;
	private String courses;
	private String timing;
}
