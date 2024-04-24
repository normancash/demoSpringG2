package com.example.demo1.controller;

import com.example.demo1.dto.DepartamentoDTO;
import com.example.demo1.model.Departamento;
import com.example.demo1.service.IServiceDepartamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamento")
public class ControllerDepartamento {

     @Autowired
     private IServiceDepartamento serviceDepartamento;

     @GetMapping("/all")
     public List<Departamento> getAll(){
         return serviceDepartamento.getAll();
     }

     @PostMapping("/create")
     public void create(@RequestBody DepartamentoDTO departamentoDTO) {
          serviceDepartamento.save(departamentoDTO);
     }

}
