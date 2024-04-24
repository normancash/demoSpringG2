package com.example.demo1.controller;

import com.example.demo1.dto.EncuestaDTO;
import com.example.demo1.model.Encuesta;
import com.example.demo1.service.IServiceEncuesta;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/create")
    public void create(@RequestBody EncuestaDTO encuestaDTO) {
        serviceEncuesta.save(encuestaDTO);
    }

    @PutMapping("/update")
    public void update(@RequestBody EncuestaDTO encuestaDTO){
        serviceEncuesta.save(encuestaDTO);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
        final boolean ret = serviceEncuesta.delete(id);
        if (!ret) {
            return ResponseEntity.badRequest().body("Encuesta no existe");
        }
        return ResponseEntity.ok("Encuesta Borrada");
    }

}
