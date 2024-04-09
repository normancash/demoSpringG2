package com.example.demo1.controller;

import com.example.demo1.model.Usuario;
import com.example.demo1.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class ControllerUsuario {

    @Autowired
    private IServiceUsuario serviceUsuario;

    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> getAll() {
        List<Usuario> lista = serviceUsuario.getAll();
        if (lista.isEmpty()) {
            return ResponseEntity.badRequest().body(lista);
        }
        return ResponseEntity.ok(lista);
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Usuario usuario) {
        serviceUsuario.createUsuario(usuario);
        return ResponseEntity.ok("Usuario creado");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Usuario usuario) {
        serviceUsuario.createUsuario(usuario);
        return ResponseEntity.ok("Usuario actualizado");
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id ) {
        serviceUsuario.deleteUsuario(id);
        return ResponseEntity.ok("Usuario borrado");
    }

}
