package com.example.demo1.dto;

import lombok.Data;

import java.util.List;

@Data
public class DepartamentoDTO {
    private Integer id;
    private String nombre;
    private List<MunicipioDTO> listMunicipioDTO;
}
