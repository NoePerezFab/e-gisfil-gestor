
package com.gisnet.egisfil.service;


import com.gisnet.egisfil.domain.Mostrador;
import java.util.List;
import java.util.Optional;


public interface MostradorService {
    Optional<Mostrador> findOne(String id);
    List<Mostrador> findAll();
    Mostrador create(Mostrador mostrador);
    Mostrador update(Mostrador mostrador);
}
