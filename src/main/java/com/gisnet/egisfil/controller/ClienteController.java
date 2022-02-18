
package com.gisnet.egisfil.controller;

import com.couchbase.client.core.deps.com.fasterxml.jackson.core.JsonProcessingException;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.ObjectMapper;
import com.gisnet.egisfil.RepositoryService.ClienteRepositoryService;
import com.gisnet.egisfil.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ClienteController {
    @Autowired
    ClienteRepositoryService repo;
    private ObjectMapper maper = new ObjectMapper();
    
    @GetMapping("/api/clientes")
    public String getClientes() throws JsonProcessingException{
        List<Cliente> lista = repo.findAll();
        return maper.writeValueAsString(lista);
    }
    
    @PostMapping("/api/addcliente")
    public String addCliente(@RequestBody Cliente cliente) throws JsonProcessingException{
        cliente.setType("cliente");
        cliente.setId("cliente::"+cliente.getNumero_cliente());
        if(repo.findOne(cliente.getId()).isPresent()){
            return "Ya existe un cliente con ese numero ";
        }
        return maper.writeValueAsString(repo.create(cliente));
    }
    
    @PostMapping("/api/updatecliente")
    public String updateCliente(@RequestBody Cliente cliente) throws JsonProcessingException{
        if(repo.findOne(cliente.getId()).isPresent()){
            return maper.writeValueAsString(repo.update(cliente));
        }
        return "No existe un cliente con ese numero de ciente";
    }
    
    @PostMapping("/api/buscarcliente")
    public String buscarCliente(@RequestBody Cliente cliente) throws JsonProcessingException{
        if(cliente.getNumero_cliente() != null){
            if(repo.findByNumeroCliente(cliente.getNumero_cliente()).isPresent()){
                return maper.writeValueAsString(repo.findByNumeroCliente(cliente.getNumero_cliente()).get());
            }
            return "No existe cliente con ese numero de cliente";
        }else if(cliente.getNumero_tarjeta() != null){
            if(repo.findByNumeroTarjeta(cliente.getNumero_tarjeta()).isPresent()){
                return maper.writeValueAsString(repo.findByNumeroTarjeta(cliente.getNumero_tarjeta()).get());
            }
            return "No existe cliente con ese numero de tarjeta";
        }
        return "Error";
    }
}
