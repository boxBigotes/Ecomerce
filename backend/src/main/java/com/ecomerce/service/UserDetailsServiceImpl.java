package com.ecomerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ecomerce.entities.Encargado;
import com.ecomerce.repository.EncargadoRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private EncargadoRepository encargadoRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Encargado encargado= encargadoRepository.findByNombre(username);
        if(encargado== null){
            throw  new UsernameNotFoundException("NO EXISTE "+username);
        }
        return User.builder()
        .username(encargado.getNombre())
        .password(encargado.getPassword())
        .build();

    }
}