package com.example.demo1.repository;

import com.example.demo1.model.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoPregunta extends JpaRepository<Pregunta,Integer> {
}
