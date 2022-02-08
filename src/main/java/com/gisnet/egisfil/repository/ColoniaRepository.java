
package com.gisnet.egisfil.repository;

import com.gisnet.egisfil.domain.Colonia;
import java.util.List;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ColoniaRepository extends CouchbaseRepository<Colonia, String>{
   @Query("#{#n1ql.selectEntity} WHERE  `cp` = '#{[0]}' AND #{#n1ql.filter} ")
    public List<Colonia> findByCodigoPostal(String cp);
}
