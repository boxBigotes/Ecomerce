package com.ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomerce.entities.Carrito;

public interface CarritoRepository extends JpaRepository<Carrito, Long>{

}
