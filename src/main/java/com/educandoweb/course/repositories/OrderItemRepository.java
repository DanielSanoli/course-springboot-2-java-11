package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	//Classe que tem conexão com o banco
	
}
