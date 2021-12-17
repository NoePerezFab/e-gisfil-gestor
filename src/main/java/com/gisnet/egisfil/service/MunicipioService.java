
package com.gisnet.egisfil.service;


import com.gisnet.egisfil.domain.Municipio;
import java.util.List;
import java.util.Optional;


public interface MunicipioService {
    Optional<Municipio> findOne(String id);
    List<Municipio> findAll();
    Municipio create(Municipio municipio);
    Municipio update(Municipio municipio);
}
