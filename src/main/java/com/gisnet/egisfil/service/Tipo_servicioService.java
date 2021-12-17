
package com.gisnet.egisfil.service;


import com.gisnet.egisfil.domain.Tipo_servicio;
import java.util.List;
import java.util.Optional;


public interface Tipo_servicioService {
    Optional<Tipo_servicio> findOne(String id);
    List<Tipo_servicio> findAll();
    Tipo_servicio create(Tipo_servicio tipoServicio);
    Tipo_servicio update(Tipo_servicio tipoServicio);
}
