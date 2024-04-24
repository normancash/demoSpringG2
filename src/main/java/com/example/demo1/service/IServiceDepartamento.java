package com.example.demo1.service;

import com.example.demo1.dto.DepartamentoDTO;
import com.example.demo1.model.Departamento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceDepartamento {

    public List<Departamento> getAll();

    public void save(DepartamentoDTO departamentoDTO);

}
