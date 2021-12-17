
package com.gisnet.egisfil.repository;

import com.gisnet.egisfil.domain.Estado;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface EstadoRepository extends CouchbaseRepository<Estado, String> {
    
}
