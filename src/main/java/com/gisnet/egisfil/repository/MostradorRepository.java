
package com.gisnet.egisfil.repository;

import com.gisnet.egisfil.domain.Mostrador;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface MostradorRepository extends CouchbaseRepository<Mostrador, String> {
    
}
