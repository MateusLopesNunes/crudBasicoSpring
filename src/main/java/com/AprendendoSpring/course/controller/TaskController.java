package com.AprendendoSpring.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.AprendendoSpring.course.model.entities.Task;
import com.AprendendoSpring.course.repository.TaskRepository;


@RestController
@RequestMapping(value = "/Task")
public class TaskController {
	
	@Autowired
	private TaskRepository repository;
	
	@GetMapping
	public List<Task> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Task insert(@RequestBody Task obj) {
		return repository.save(obj);
	}
	
	@DeleteMapping
	public void update(Task obj) {
		List<Task> list = repository.findAll();
		repository.deleteById(obj.getId());
	}

}
