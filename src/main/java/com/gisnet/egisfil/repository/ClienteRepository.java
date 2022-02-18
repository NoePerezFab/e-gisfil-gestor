
package com.gisnet.egisfil.repository;

import com.gisnet.egisfil.domain.Cliente;
import java.util.List;
import java.util.Optional;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CouchbaseRepository<Cliente, String>{
    @Query("#{#n1ql.selectEntity} WHERE  `numero_tarjeta` = '#{[0]}' AND #{#n1ql.filter} ")
    public Optional<Cliente> findByNumeroTarjeta(String numeroTarjeta);
    @Query("#{#n1ql.selectEntity} WHERE  `numero_cliente` = '#{[0]}' AND #{#n1ql.filter} ")
    public Optional<Cliente> findByNumeroCliente(String numeroCliente);
}
