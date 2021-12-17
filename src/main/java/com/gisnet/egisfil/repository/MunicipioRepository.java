
package com.gisnet.egisfil.repository;

import com.gisnet.egisfil.domain.Municipio;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface MunicipioRepository extends CouchbaseRepository<Municipio, String> {
    
}
