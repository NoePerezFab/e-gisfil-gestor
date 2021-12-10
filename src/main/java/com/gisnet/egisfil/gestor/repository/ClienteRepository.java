
package com.gisnet.egisfil.gestor.repository;

import com.gisnet.egisfil.gestor.domain.Cliente;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CouchbaseRepository<Cliente, String>{
    
}
