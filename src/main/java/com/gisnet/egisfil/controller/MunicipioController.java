
package com.gisnet.egisfil.controller;

import com.couchbase.client.core.deps.com.fasterxml.jackson.core.JsonProcessingException;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;
import com.gisnet.egisfil.RepositoryService.MunicipioRepositoryService;
import com.gisnet.egisfil.domain.Municipio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MunicipioController {
    @Autowired
    MunicipioRepositoryService repo;
    
    private ObjectMapper maper = new ObjectMapper();
    
    @GetMapping("/api/municipios")
    public String getMunicipios() throws JsonProcessingException{
        List<Municipio> lista = repo.findAll();
        return maper.writeValueAsString(lista);
    }
    
    @PostMapping("/api/addmunicipio")
    public String addMunicipio(@RequestBody Municipio municipio) throws JsonProcessingException{
        municipio.setType("municipio");
        municipio.setId("municipio::"+municipio.getClave());
        if(repo.findOne(municipio.getId()).isPresent()){
            return "Ya existe un municipio con esa clave";
        }
        return maper.writeValueAsString(repo.create(municipio));
    }
    
    @PostMapping("/api/updatemunicipio")
    public String updateMunicipio(@RequestBody Municipio municipio) throws JsonProcessingException{
        if(repo.findOne(municipio.getId()).isPresent()){
            return maper.writeValueAsString(repo.update(municipio));
        }else{
            return "No existe un municipio con esa clave";
        }
    }
}
