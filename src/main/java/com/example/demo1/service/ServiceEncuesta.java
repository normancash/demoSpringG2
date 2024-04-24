package com.example.demo1.service;

import com.example.demo1.dto.EncuestaDTO;
import com.example.demo1.dto.PreguntaDTO;
import com.example.demo1.model.Encuesta;
import com.example.demo1.model.Pregunta;
import com.example.demo1.repository.IRepoEncuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceEncuesta implements IServiceEncuesta{

    @Autowired
    private IRepoEncuesta repoEncuesta;
    @Override
    public List<Encuesta> getAll() {
        return repoEncuesta.findAll();
    }

    @Override
    public void save(EncuestaDTO encuestaDTO) {
        Encuesta encuesta = repoEncuesta.findById(encuestaDTO.getId()).orElse(null);
        if (encuesta == null) {
            encuesta = new Encuesta();
            encuesta.setId(encuestaDTO.getId());
            encuesta.setNombre(encuestaDTO.getNombre());
        }
        List<PreguntaDTO> lista = encuestaDTO.getPreguntasDTO();
        List<Pregunta> listaP = new ArrayList<>();

    }

}
