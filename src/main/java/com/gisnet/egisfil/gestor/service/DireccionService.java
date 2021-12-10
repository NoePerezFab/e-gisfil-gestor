
package com.gisnet.egisfil.gestor.service;


import com.gisnet.egisfil.gestor.domain.Direccion;
import java.util.List;
import java.util.Optional;


public interface DireccionService {
    Optional<Direccion> findOne(String id);
    List<Direccion> findAll();
    Direccion create(Direccion direccion);
    Direccion update(Direccion direccion);
}
