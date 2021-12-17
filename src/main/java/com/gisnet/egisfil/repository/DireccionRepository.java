
package com.gisnet.egisfil.repository;

import com.gisnet.egisfil.domain.Direccion;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface DireccionRepository extends CouchbaseRepository<Direccion, String> {
    
}
