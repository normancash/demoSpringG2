package com.example.demo1.controller;

import com.example.demo1.model.Usuario;
import com.example.demo1.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/welcome")
public class Welcome {

    @Autowired
    @Qualifier("serviceUsuario")
    private IServiceUsuario serviceUsuario;

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("hola");
    }

    @GetMapping("/goodbye")
    public ResponseEntity<String> goodBye(){
        return new ResponseEntity<>("Gracias", HttpStatus.OK);
    }


}
