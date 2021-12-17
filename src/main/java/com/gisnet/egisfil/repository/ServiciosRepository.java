
package com.gisnet.egisfil.repository;

import com.gisnet.egisfil.domain.Servicios;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface ServiciosRepository extends CouchbaseRepository<Servicios, String>{
    
}
