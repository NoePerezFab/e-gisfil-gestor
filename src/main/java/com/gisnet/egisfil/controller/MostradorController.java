
package com.gisnet.egisfil.controller;

import com.couchbase.client.core.deps.com.fasterxml.jackson.core.JsonProcessingException;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;
import com.gisnet.egisfil.RepositoryService.MostradorRepositoryService;
import com.gisnet.egisfil.domain.Mostrador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MostradorController {
    @Autowired
    MostradorRepositoryService repo;
    
    private ObjectMapper maper = new ObjectMapper();
    
    /*@GetMapping("/api/mostradores")
    public String getMostradores() throws JsonProcessingException{
        List<Mostrador> lista = repo.findAll();
        return maper.writeValueAsString(lista);
    }
    
    @PostMapping("/api/addmostrador")
    public String addMostrador(@RequestBody Mostrador mostrador) throws JsonProcessingException{
        mostrador.setType("mostrador");
        mostrador.setId("mostrador::"+mostrador.getClave());
        if(repo.findOne(mostrador.getId()).isPresent()){
            return "Ya existe un mostrador con esa clave";
        }
        return maper.writeValueAsString(repo.create(mostrador));
        
    }
    
    @PostMapping("/api/updatemostrador")
    public String updateMostrador(@RequestBody Mostrador mostrador) throws JsonProcessingException{
        if(repo.findOne(mostrador.getId()).isPresent()){
            return maper.writeValueAsString(repo.update(mostrador));
        }else{
            return "No existe un mostrador co nesa clave";
        }
    }*/
}
