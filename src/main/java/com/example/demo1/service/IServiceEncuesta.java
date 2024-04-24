package com.example.demo1.service;

import com.example.demo1.dto.EncuestaDTO;
import com.example.demo1.model.Encuesta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceEncuesta {

    public List<Encuesta> getAll();

    public void save(EncuestaDTO encuestaDTO);

    public boolean delete(Integer id);

    public void update(EncuestaDTO encuestaDTO);
}
