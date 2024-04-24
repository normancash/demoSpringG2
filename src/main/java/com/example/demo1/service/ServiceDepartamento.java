package com.example.demo1.service;

import com.example.demo1.dto.DepartamentoDTO;
import com.example.demo1.dto.MunicipioDTO;
import com.example.demo1.model.Departamento;
import com.example.demo1.model.Municipio;
import com.example.demo1.repository.IRepoDepartamento;
import com.example.demo1.repository.IRepoMunicipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceDepartamento implements IServiceDepartamento{

    @Autowired
    private IRepoDepartamento repoDepartamento;

    @Autowired
    private IRepoMunicipio repoMunicipio;
    @Override
    public List<Departamento> getAll() {
        return repoDepartamento.findAll();
    }

    @Override
    public void save(DepartamentoDTO departamentoDTO) {
        Departamento departamento = repoDepartamento
                .findById(departamentoDTO.getId())
                .orElse(null);
        if (departamento == null) {
            departamento = new Departamento();
            departamento.setId(departamentoDTO.getId());
            departamento.setNombre(departamentoDTO.getNombre());
        }
        List<Municipio> municipios = new ArrayList<>();
        for (MunicipioDTO m : departamentoDTO.getListMunicipioDTO()) {
            Municipio municipio = repoMunicipio
                    .findById(m.getId())
                    .orElse(null);
            if (municipio == null) {
                municipio = new Municipio();
                municipio.setId(m.getId());
                municipio.setNombre(m.getNombre());
            }
            municipio.setDepartamento(departamento);
            municipios.add(municipio);
        }
        departamento.setMunicipio(municipios);
        repoDepartamento.save(departamento);
    }
}
