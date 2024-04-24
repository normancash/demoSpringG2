package com.example.demo1.dto;

import com.example.demo1.model.TIPOPREGUNTA;
import lombok.Data;

@Data
public class PreguntaDTO {

    private Integer id;

    private String enunciado;

    private TIPOPREGUNTA tipoPregunta;
}
