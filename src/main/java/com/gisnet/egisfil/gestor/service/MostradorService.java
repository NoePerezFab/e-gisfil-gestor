
package com.gisnet.egisfil.gestor.service;


import com.gisnet.egisfil.gestor.domain.Mostrador;
import java.util.List;
import java.util.Optional;


public interface MostradorService {
    Optional<Mostrador> findOne(String id);
    List<Mostrador> findAll();
    Mostrador create(Mostrador mostrador);
    Mostrador update(Mostrador mostrador);
}
