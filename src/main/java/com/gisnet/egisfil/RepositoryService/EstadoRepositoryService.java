
package com.gisnet.egisfil.RepositoryService;

import com.gisnet.egisfil.domain.Estado;
import com.gisnet.egisfil.repository.EstadoRepository;
import com.gisnet.egisfil.service.EstadoService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoRepositoryService implements EstadoService{
    @Autowired
    EstadoRepository repo;
    @Override
    public Optional<Estado> findOne(String id) {
       return  repo.findById(id);
    }

    @Override
    public List<Estado> findAll() {
        List<Estado> lista = new ArrayList<>();
        Iterator it = repo.findAll().iterator();
        while(it.hasNext()){
            lista.add((Estado)it.next());
        }
        return lista;
    }

    @Override
    public Estado create(Estado estado) {
       return repo.save(estado);
    }

    @Override
    public Estado update(Estado estado) {
        return repo.save(estado);
    }
    
}
