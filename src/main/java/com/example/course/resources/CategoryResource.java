package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Category;
import com.example.course.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

	@Autowired
	CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> categoryList = service.findAll();
		
		return ResponseEntity.ok(categoryList);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		
		Category category = service.findById(id);
		
		return ResponseEntity.ok(category);
		
	}
	
}
