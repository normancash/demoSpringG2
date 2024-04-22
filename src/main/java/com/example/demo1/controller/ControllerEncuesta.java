package com.example.demo1.controller;

import com.example.demo1.dto.EncuestaDTO;
import com.example.demo1.model.Encuesta;
import com.example.demo1.service.IServiceEncuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/encuesta")
@CrossOrigin("*")
public class ControllerEncuesta {

    @Autowired
    private IServiceEncuesta serviceEncuesta;

    @GetMapping("/all")
    public List<Encuesta> getAll() {
       return serviceEncuesta.getAll();
    }

    @PostMapping("/crear")
    public void create(@RequestBody EncuestaDTO encuestaDTO) {
        serviceEncuesta.save(encuestaDTO);
    }
}
