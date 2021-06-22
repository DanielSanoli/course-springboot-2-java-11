package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	//método para buscar todos os usuarios da lista
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	//método para fazer a busca por id
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();		
	}
	
}