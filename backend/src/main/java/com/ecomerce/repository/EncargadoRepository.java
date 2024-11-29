package com.ecomerce.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomerce.entities.Encargado;


public interface EncargadoRepository extends JpaRepository<Encargado, Long> {
    Encargado findByNombre(String nombre);
}
