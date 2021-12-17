
package com.gisnet.egisfil.service;


import com.gisnet.egisfil.domain.Estado;
import java.util.List;
import java.util.Optional;


public interface EstadoService {
   Optional<Estado> findOne(String id);
    List<Estado> findAll();
    Estado create(Estado estado);
    Estado update(Estado estado);
}
