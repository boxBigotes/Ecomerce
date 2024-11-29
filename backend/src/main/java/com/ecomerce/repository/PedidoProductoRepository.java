package com.ecomerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomerce.entities.PedidoProducto;

public interface PedidoProductoRepository extends JpaRepository<PedidoProducto, Long>{
    
    //PedidoProducto_findByProductoNombre
    List<PedidoProducto> findAllByPedidonombre(String nombre);

    //PedidoProducto_deleteByNombre
    void PedidoProducto_deleteByNombre(String nombre);
}


