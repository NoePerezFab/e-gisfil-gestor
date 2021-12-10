
package com.gisnet.egisfil.gestor.service;


import com.gisnet.egisfil.gestor.domain.Cliente;
import java.util.List;
import java.util.Optional;


public interface ClienteService {
    Optional<Cliente> findOne(String id);
    List<Cliente> findAll();
    Cliente create(Cliente cliente);
    Cliente update(Cliente cliente);
}
