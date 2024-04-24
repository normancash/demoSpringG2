package com.example.demo1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Encuesta {
    @Id
    private Integer id;

    private String nombre;

    @OneToMany(cascade= CascadeType.ALL
            ,mappedBy = "encuesta")
    private List<Pregunta> preguntas;
}
