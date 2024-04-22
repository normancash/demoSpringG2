package com.example.demo1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Pregunta {

    @Id
    private Integer id;

    private String enunciado;

    private TIPOPREGUNTA tipoPregunta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="encuesta_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Encuesta encuesta;
}
