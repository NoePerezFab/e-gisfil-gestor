
package com.gisnet.egisfil.repository;

import com.gisnet.egisfil.domain.Tipo_servicio;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tipo_servicioRepository extends CouchbaseRepository<Tipo_servicio, String> {
    
}
