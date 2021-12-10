
package com.gisnet.egisfil.gestor.repository;

import com.gisnet.egisfil.gestor.domain.Colonia;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColoniaRepository extends CouchbaseRepository<Colonia, String>{
    
}
