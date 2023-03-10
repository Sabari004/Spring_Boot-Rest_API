package com.example.demo.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Student;
import com.example.demo.Repositories.StudentRepo;



@Service
public class ApiService {

	@Autowired
	StudentRepo repository;
	
	public String addStudent(Student students) {
		repository.save(students);
		return "Added";
	}
	public List<Student> getStudent(){
		return (List<Student>) repository.findAll();
	}
	public Optional<Student> getStudentById(int id){
		return repository.findById(id);
	}
	public String updateStudent(Student students) {
		repository.save(students);
		return "Updated";
	}
	public String deleteStudentById(int id) {
		repository.deleteById(id);
		return "student deleted";
	}
}