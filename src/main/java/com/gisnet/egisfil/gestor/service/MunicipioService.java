
package com.gisnet.egisfil.gestor.service;


import com.gisnet.egisfil.gestor.domain.Municipio;
import java.util.List;
import java.util.Optional;


public interface MunicipioService {
    Optional<Municipio> findOne(String id);
    List<Municipio> findAll();
    Municipio create(Municipio municipio);
    Municipio update(Municipio municipio);
}
