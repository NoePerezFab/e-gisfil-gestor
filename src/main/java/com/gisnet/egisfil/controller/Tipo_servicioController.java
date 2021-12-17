
package com.gisnet.egisfil.controller;

import com.couchbase.client.core.deps.com.fasterxml.jackson.core.JsonProcessingException;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;
import com.gisnet.egisfil.RepositoryService.Tipo_servicioRepositoryService;
import com.gisnet.egisfil.domain.Tipo_servicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tipo_servicioController {
    @Autowired
    Tipo_servicioRepositoryService repo;
    
    private ObjectMapper maper = new ObjectMapper();
    
    @GetMapping("/api/tiposservicios")
    public String getTiposServicios() throws JsonProcessingException{
        List<Tipo_servicio> lista = repo.findAll();
        return maper.writeValueAsString(lista);
    }
    
    @PostMapping("/api/addtiposervicio")
    public String addTipoServicio(@RequestBody Tipo_servicio tipoServicio) throws JsonProcessingException{
        tipoServicio.setType("Tipo_servicio");
        tipoServicio.setId("Tipo_servicio::"+tipoServicio.getClave());
        if(repo.findOne(tipoServicio.getId()).isPresent()){
            return "Ya existe una sucursal con ese nombre";
        }
        return maper.writeValueAsString(repo.create(tipoServicio));
    }
    
    @PostMapping("/api/updatetiposervicio")
    public String updateTipoServicio(@RequestBody Tipo_servicio tipoServicio) throws JsonProcessingException{
        if(repo.findOne(tipoServicio.getId()).isPresent()){
            return maper.writeValueAsString(repo.update(tipoServicio));
        }
        return "No existe una sucursal con ese nombre";
    }
}
