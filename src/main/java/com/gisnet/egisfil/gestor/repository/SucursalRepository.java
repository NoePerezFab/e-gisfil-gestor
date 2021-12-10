
package com.gisnet.egisfil.gestor.repository;

import com.gisnet.egisfil.gestor.domain.Sucursal;
import org.springframework.data.couchbase.repository.CouchbaseRepository;


public interface SucursalRepository extends CouchbaseRepository<Sucursal, String>{
    
}
