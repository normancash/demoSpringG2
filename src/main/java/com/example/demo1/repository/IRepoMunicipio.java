package com.example.demo1.repository;

import com.example.demo1.model.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoMunicipio extends JpaRepository<Municipio,Integer> {
}
