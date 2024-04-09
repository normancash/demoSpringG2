package com.example.demo1.service;

import com.example.demo1.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceUsuario {

    public List<Usuario> getAll();

    void createUsuario(Usuario usuario);

    void deleteUsuario(Integer id);
}
