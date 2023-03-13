package com.student.studentapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.studentapi.model.student;
import com.student.studentapi.repo.studentrepo;

@Component
public class studentservice {

	@Autowired
	studentrepo sp;
	
	public student addstu(student st)
	{
		sp.save(st);
		return st;
	}
	
	public List<student> getstu()
	{
		List<student>ls=new ArrayList<>();
		sp.findAll().forEach(ls::add);
		return ls;
	}
	
	public void deletestu(Integer sid)
	{
		sp.deleteById(sid);
	}
	
	public student updatestu(student st)
	{
		student st1=sp.save(st);
		return st1;
				
	}
}
