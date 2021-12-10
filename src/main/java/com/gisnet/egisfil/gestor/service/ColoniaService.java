
package com.gisnet.egisfil.gestor.service;

import com.gisnet.egisfil.gestor.domain.Colonia;
import java.util.List;
import java.util.Optional;


public interface ColoniaService {
    Optional<Colonia> findOne(String id);
    List<Colonia> findAll();
    Colonia create(Colonia colonia);
    Colonia update(Colonia colonia);
}
