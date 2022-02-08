
package com.gisnet.egisfil.service;

import com.gisnet.egisfil.domain.Colonia;
import java.util.List;
import java.util.Optional;


public interface ColoniaService {
    Optional<Colonia> findOne(String id);
    List<Colonia> findAll();
    Colonia create(Colonia colonia);
    Colonia update(Colonia colonia);
    public List<Colonia> findByCodigoPostal(String cp);
}
