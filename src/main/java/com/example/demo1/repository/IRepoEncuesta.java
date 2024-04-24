package com.example.demo1.repository;


import com.example.demo1.model.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoEncuesta extends JpaRepository<Encuesta,Integer> {
}
