
package com.gisnet.egisfil.gestor.repository;

import com.gisnet.egisfil.gestor.domain.Mostrador;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface MostradorRepository extends CouchbaseRepository<Mostrador, String> {
    
}
