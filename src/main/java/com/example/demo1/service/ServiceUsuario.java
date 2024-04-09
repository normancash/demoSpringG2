package com.example.demo1.service;

import com.example.demo1.model.Usuario;
import com.example.demo1.repository.IRepoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUsuario implements IServiceUsuario{

    @Autowired
    private IRepoUsuario repo;

    @Override
    public List<Usuario> getAll() {
        return repo.findAll();
    }

    @Override
    public void createUsuario(Usuario usuario) {
        repo.save(usuario);
    }

    @Override
    public void deleteUsuario(Integer id) {
        repo.deleteById(id);
    }
}
