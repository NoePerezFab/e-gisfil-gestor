
package com.gisnet.egisfil.gestor.RepositoryService;

import com.gisnet.egisfil.gestor.domain.Servicios;
import com.gisnet.egisfil.gestor.repository.ServiciosRepository;
import com.gisnet.egisfil.gestor.service.ServiciosService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiciosRepositoryService implements ServiciosService{
    @Autowired
    ServiciosRepository repo;
    @Override
    public Optional<Servicios> findOne(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Servicios> findAll() {
        List<Servicios> lista = new ArrayList<>();
        Iterator it = repo.findAll().iterator();
        while(it.hasNext()){
            lista.add((Servicios)it.next());
        }
        return lista;
    }

    @Override
    public Servicios create(Servicios servicios) {
        return repo.save(servicios);
    }

    @Override
    public Servicios update(Servicios servicios) {
        return repo.save(servicios);
    }
    
}
