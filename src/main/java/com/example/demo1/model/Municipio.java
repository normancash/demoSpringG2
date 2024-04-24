package com.example.demo1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Municipio {

    @Id
    private Integer id;

    private String nombre;

    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    @JoinColumn(name="departamento_id")
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    private Departamento departamento;
}
