package com.ecomerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecomerce.entities.Carrito;
import com.ecomerce.repository.CarritoRepository;

@Service
public class CarritoService {
    private final CarritoRepository carritoRepository;

    public CarritoService(CarritoRepository carritoRepository) {
        this.carritoRepository = carritoRepository;
    }

    //Carrito_findAll
    public List<Carrito> Carrito_findAll() {
        return carritoRepository.findAll();
    }

    //Carrito_findById
    public Optional<Carrito> Carrito_findById(Long id) {
        return carritoRepository.findById(id);
    }

    //Carrito_save
    public Carrito Carrito_save(Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    //Carrito_deleteById
    public void Carrito_deleteById(Long id) {
        carritoRepository.deleteById(id);
    }
    
}
