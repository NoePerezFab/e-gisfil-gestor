
package com.gisnet.egisfil.gestor.controller;

import com.couchbase.client.core.deps.com.fasterxml.jackson.core.JsonProcessingException;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;
import com.gisnet.egisfil.gestor.RepositoryService.DireccionRepositoryService;
import com.gisnet.egisfil.gestor.domain.Direccion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DireccionController {
    @Autowired
    DireccionRepositoryService repo;
    
    private ObjectMapper maper = new ObjectMapper();
    
    @GetMapping("/api/direcciones")
    public String getDirecciones() throws JsonProcessingException{
        List<Direccion> lista = repo.findAll();
        return maper.writeValueAsString(lista);
    }
    
    @PostMapping("/api/adddireccion")
    public String addDireccion(@RequestBody Direccion direccion) throws JsonProcessingException{
        direccion.setType("direccion");
        direccion.setId("direccion::"+direccion.getClave());
        if(repo.findOne(direccion.getId()).isPresent()){
            return "Ya existe una direccion con esa clave";
        }
        return maper.writeValueAsString(repo.create(direccion));
    }
    @PostMapping("/api/updatedireccion")
    public String updateDireccion(@RequestBody Direccion direccion) throws JsonProcessingException{
        if(repo.findOne(direccion.getId()).isPresent()){
            return maper.writeValueAsString(repo.update(direccion));
        }else{
            return "No existe una direccion con esa clave";
        }
    }
}
