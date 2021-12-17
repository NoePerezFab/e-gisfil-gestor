
package com.gisnet.egisfil.controller;

import com.couchbase.client.core.deps.com.fasterxml.jackson.core.JsonProcessingException;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;
import com.gisnet.egisfil.RepositoryService.EstadoRepositoryService;
import com.gisnet.egisfil.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstadoController {
    @Autowired
    EstadoRepositoryService repo;
    private ObjectMapper maper = new ObjectMapper();
    
    @GetMapping("/api/estados")
    public String getEstados() throws JsonProcessingException{
        List<Estado> lista = repo.findAll();
        return maper.writeValueAsString(lista);
    }
    
    @PostMapping("/api/addestado")
    public String addEstado(@RequestBody Estado estado) throws JsonProcessingException{
        estado.setType("estado");
        estado.setId("estado::"+estado.getClave());
        if(repo.findOne(estado.getId()).isPresent()){
            return "Ya existe un estado con esa clave";
        }
        return maper.writeValueAsString(repo.create(estado));
        
    }
    
    @PostMapping("/api/updateestado")
    public String updateEstado(@RequestBody Estado estado) throws JsonProcessingException{
        if(repo.findOne(estado.getId()).isPresent()){
            return maper.writeValueAsString(repo.update(estado));
        }else{
            return "No existe un estado con esa clave";
        }
    }
}
