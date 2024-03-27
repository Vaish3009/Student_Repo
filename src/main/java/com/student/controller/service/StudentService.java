package com.student.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService {
   @Autowired
   private StudentRepository studentRepository;
   
   public void save(Student student) {
   	studentRepository.save(student);
   }
   
   public List<Student> getAll(){
   	return studentRepository.findAll();
   }
   
   public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}
	
	public void deleteStudentById(int id) {
		 studentRepository.deleteById(id);
	}
}
