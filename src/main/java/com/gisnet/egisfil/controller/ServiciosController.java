
package com.gisnet.egisfil.controller;

import com.couchbase.client.core.deps.com.fasterxml.jackson.core.JsonProcessingException;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;
import com.gisnet.egisfil.RepositoryService.ServiciosRepositoryService;
import com.gisnet.egisfil.domain.Servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiciosController {
    @Autowired
    private ServiciosRepositoryService repo;
    
    private ObjectMapper maper = new ObjectMapper();
    
    @GetMapping("/api/servicios")
    public String getServicios() throws JsonProcessingException{
        List<Servicios> lista = repo.findAll();
        return maper.writeValueAsString(lista);
    }
    
    @PostMapping("/api/addservicio")
    public String addServicio(@RequestBody Servicios servicios) throws JsonProcessingException{
        servicios.setType("servicios");
        servicios.setId("servicios_"+servicios.getClave());
        if(repo.findOne(servicios.getId()).isPresent()){
            return "Ya existe un servicio con esa clave";
        }
        Servicios s = repo.create(servicios);
        return maper.writeValueAsString(s);
        
    }
    @PostMapping("/api/updateservicios")
    public String updateServicios(@RequestBody Servicios servicios) throws JsonProcessingException{
        
        if(repo.findOne(servicios.getId()).isPresent()){
            Servicios s = repo.findOne(servicios.getId()).get();
            return maper.writeValueAsString(repo.update(s));
            
        }else{
            return "No existe un servicio con esa clave";
        }
        
    }
}
