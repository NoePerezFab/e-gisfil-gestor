
package com.gisnet.egisfil.gestor.repository;

import com.gisnet.egisfil.gestor.domain.Direccion;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface DireccionRepository extends CouchbaseRepository<Direccion, String> {
    
}
