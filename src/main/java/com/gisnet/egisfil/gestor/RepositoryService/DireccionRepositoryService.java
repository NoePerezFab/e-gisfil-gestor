
package com.gisnet.egisfil.gestor.RepositoryService;

import com.gisnet.egisfil.gestor.domain.Direccion;
import com.gisnet.egisfil.gestor.repository.DireccionRepository;
import com.gisnet.egisfil.gestor.service.DireccionService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;


public class DireccionRepositoryService implements DireccionService{
    @Autowired
    DireccionRepository repo;
    @Override
    public Optional<Direccion> findOne(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Direccion> findAll() {
        List<Direccion> lista = new ArrayList<>();
        Iterator it = repo.findAll().iterator();
        while(it.hasNext()){
            lista.add((Direccion)it.next());
        }
        return lista;
    }

    @Override
    public Direccion create(Direccion direccion) {
        return repo.save(direccion);
    }

    @Override
    public Direccion update(Direccion direccion) {
        return repo.save(direccion);
    }
    
}
