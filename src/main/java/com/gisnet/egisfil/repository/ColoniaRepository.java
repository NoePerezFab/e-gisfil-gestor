
package com.gisnet.egisfil.repository;

import com.gisnet.egisfil.domain.Colonia;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColoniaRepository extends CouchbaseRepository<Colonia, String>{
    
}
