package com.example.demo1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Departamento {

    @Id
    private Integer id;

    private String nombre;

    @OneToMany(mappedBy = "departamento",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Municipio> municipio;
}
