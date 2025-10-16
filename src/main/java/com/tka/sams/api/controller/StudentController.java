package com.tka.sams.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.sams.api.entity.Student;
import com.tka.sams.api.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:4200")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/getallstudents")
	public List<Student> getAllStudents() {
		System.out.println("called received from angular");
		return studentService.getAllStudents();
	}

	@PostMapping("/add-student")
	public Student createStudent(@RequestBody Student student) {
		System.out.println("in student controller");
		return studentService.createStudent(student);
	}

	@GetMapping("/get-student-by-id/{id}")
	public Student getStudentById(@PathVariable Long id) {
		System.out.println("in student controller");
		return studentService.getStudentById(id);
	}

	@PutMapping("/update-student")
	public Student updateStudent(@RequestBody Student studentDetails) {
		System.out.println("in update student method");

		return studentService.updateStudent(studentDetails);
	}

	@DeleteMapping("/delete-student/{id}")
	public String deleteStudent(@PathVariable long id) {
		return studentService.deleteStudent(id);
	}
	
	@GetMapping("/gethorse")
	public Student horse()
	{
		System.out.println("In horse method");
		return null;
	}
	
	
}
