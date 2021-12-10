
package com.gisnet.egisfil.gestor.repository;

import com.gisnet.egisfil.gestor.domain.Estado;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface EstadoRepository extends CouchbaseRepository<Estado, String> {
    
}
