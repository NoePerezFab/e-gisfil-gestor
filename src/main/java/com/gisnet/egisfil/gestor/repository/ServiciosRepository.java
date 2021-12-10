
package com.gisnet.egisfil.gestor.repository;

import com.gisnet.egisfil.gestor.domain.Servicios;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface ServiciosRepository extends CouchbaseRepository<Servicios, String>{
    
}
