package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.app.model.Subject;
import com.app.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	private SubjectService subjectService;

	@GetMapping("/subjects")
	public List<Subject> getAllSubjects()
	{
		return subjectService.getAllSubjects();
	}
	
	@PostMapping("/subjects")
	public void addSubject(@RequestBody Subject subject)
	{
		subjectService.addSubject(subject);
	}
	
	@PutMapping("/subjects/{id}")
	public void updateSubject(@PathVariable String id, @RequestBody Subject subject)
	{
		subjectService.updateSubject(id, subject);
	}
	@DeleteMapping("/subjects/{id}")
	public void DeleteSubject(@PathVariable String id)
	{
		subjectService.deleteSubject(id);
	}
}