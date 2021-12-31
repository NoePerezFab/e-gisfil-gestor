
package com.gisnet.egisfil.controller;

import com.couchbase.client.core.deps.com.fasterxml.jackson.core.JsonProcessingException;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;
import com.gisnet.egisfil.RepositoryService.ServiciosRepositoryService;
import com.gisnet.egisfil.RepositoryService.SucursalRepositoryService;
import com.gisnet.egisfil.domain.Servicios;
import com.gisnet.egisfil.domain.Sucursal;
import com.gisnet.egisfil.util.AddServiceRequest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SucursalController {
    @Autowired
    SucursalRepositoryService repo;
    
    @Autowired
    ServiciosRepositoryService repoServicios;
    
    private ObjectMapper maper = new ObjectMapper();
    
    @GetMapping("/api/sucursales")
    public String getSucursales() throws JsonProcessingException{
        List<Sucursal> lista = repo.findAll();
        return maper.writeValueAsString(lista);
    }
    
    @PostMapping("/api/addsucursal")
    public String addSucursal(@RequestBody Sucursal sucursal) throws JsonProcessingException{
        sucursal.setType("sucursal");
        sucursal.setId("sucursal::"+sucursal.getClave());
        if(repo.findOne(sucursal.getId()).isPresent()){
            return "Ya existe una sucursal con ese nombre";
        }
        return maper.writeValueAsString(repo.create(sucursal));
    }
    
    @PostMapping("/api/updatesucursal")
    public String updateSucursal(@RequestBody Sucursal sucursal) throws JsonProcessingException{
        if(repo.findOne(sucursal.getId()).isPresent()){
            return maper.writeValueAsString(repo.update(sucursal));
        }
        return "No existe una sucursal con ese nombre";
    }
    
    @PostMapping("/api/addserviciosucursal")
    public String addServicio(@RequestBody AddServiceRequest request) throws JsonProcessingException{
        Sucursal sucursal;
        if(repo.findOne(request.getSucursal().getId()).isPresent()){
            sucursal = repo.findOne(request.getSucursal().getId()).get();
        }else{
            return "La sucursal no existe";
        }
        List<Servicios> lista = new ArrayList<>();
        if(sucursal.getServicios() != null){
             lista = sucursal.getServicios();
        }
        Servicios servicio;
        if(repoServicios.findOne(request.getServicio().getId()).isPresent()){
            servicio = repoServicios.findOne(request.getServicio().getId()).get();
        }else{
            return "No existe el servicio";
        }
        for(Servicios s : lista){
            if(s.getId().equals(servicio.getId())){
                return "El servicio ya existe en esta sucursal";
            }
        }
        lista.add(servicio);
        sucursal.setServicios(lista);
        return maper.writeValueAsString(repo.update(sucursal));
    }
}
