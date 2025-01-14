package com.ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.entities.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
