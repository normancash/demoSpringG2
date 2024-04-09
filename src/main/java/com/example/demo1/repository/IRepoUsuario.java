package com.example.demo1.repository;

import com.example.demo1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoUsuario extends JpaRepository<Usuario,Integer> {
}
