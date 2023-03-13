package com.student.studentapi.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.studentapi.model.student;
@Repository
public interface studentrepo extends CrudRepository<student, Integer> {

}
