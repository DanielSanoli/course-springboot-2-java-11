package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	//método para buscar todos os usuarios da lista
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	//método para fazer a busca por id
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();		
	}
	
}
