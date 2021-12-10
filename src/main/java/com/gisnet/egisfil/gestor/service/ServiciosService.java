
package com.gisnet.egisfil.gestor.service;


import com.gisnet.egisfil.gestor.domain.Servicios;
import java.util.List;
import java.util.Optional;

public interface ServiciosService {
    Optional<Servicios> findOne(String id);
    List<Servicios> findAll();
    Servicios create(Servicios servicios);
    Servicios update(Servicios servicios);
}
