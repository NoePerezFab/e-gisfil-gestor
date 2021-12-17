
package com.gisnet.egisfil.controller;

import com.couchbase.client.core.deps.com.fasterxml.jackson.core.JsonProcessingException;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;
import com.gisnet.egisfil.RepositoryService.ColoniaRepositoryService;
import com.gisnet.egisfil.domain.Colonia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColoniaController {
    @Autowired
    ColoniaRepositoryService repo;
    
    private ObjectMapper maper = new ObjectMapper();
    
    @GetMapping("/api/colonias")
    public String getColonias() throws JsonProcessingException{
        List<Colonia> lista = repo.findAll();
        return maper.writeValueAsString(lista);
    }
    
    @PostMapping("/api/addcolonia")
    public String addColonia(@RequestBody Colonia colonia) throws JsonProcessingException{
        colonia.setType("colonia");
        colonia.setId("colonia::"+colonia.getClave());
        if(repo.findOne(colonia.getId()).isPresent()){
            return "Ya existe una colonia con esa clave";
        }
        return maper.writeValueAsString(repo.create(colonia));
    }
    
    @PostMapping("/api/updateColonia")
    public String updateColonia(@RequestBody Colonia colonia) throws JsonProcessingException{
        if(repo.findOne(colonia.getId()).isPresent()){
            return maper.writeValueAsString(repo.update(colonia));
        }else{
            return "No existe una colonia con esa clave";
        }
    }
    
}
