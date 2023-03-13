package com.student.studentapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentapi.model.student;
import com.student.studentapi.service.studentservice;

@RestController
@RequestMapping("/student")
public class studentcontroller {

	@Autowired
	studentservice sv;
	
	@PostMapping("/addstu")
	public student savestu( @RequestBody student st)
	{
	student st1=	sv.addstu(st);
	return st1;
	}
	
	@GetMapping("/getallstu")
	public List<student> getallstu()
	{
		List<student>ls=sv.getstu();
		return ls;
	}
	
	@GetMapping("/deletestu/{id}")
	public void deletestu(@PathVariable String id)
	{
		sv.deletestu(Integer.parseInt(id));
	}
	
	@PutMapping("/updatestu")
	public String updatestu( @RequestBody    student st)
	{
		student st1=sv.updatestu(st);
		return "student is updated";
	}
}
