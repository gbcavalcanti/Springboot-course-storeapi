package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Order;
import com.example.course.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderResource {

	@Autowired
	OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		
		List<Order> orderList = service.findAll();
		
		return ResponseEntity.ok(orderList);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		
		Order order = service.findById(id);
		
		return ResponseEntity.ok(order);
		
	}
	
}
