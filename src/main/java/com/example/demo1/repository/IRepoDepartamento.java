package com.example.demo1.repository;

import com.example.demo1.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoDepartamento extends JpaRepository<Departamento,Integer> {
}
