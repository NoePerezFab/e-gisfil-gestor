
package com.gisnet.egisfil.gestor.repository;

import com.gisnet.egisfil.gestor.domain.Municipio;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface MunicipioRepository extends CouchbaseRepository<Municipio, String> {
    
}
