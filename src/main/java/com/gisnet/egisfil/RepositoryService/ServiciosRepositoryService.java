
package com.gisnet.egisfil.RepositoryService;

import com.gisnet.egisfil.domain.Servicios;
import com.gisnet.egisfil.repository.ServiciosRepository;
import com.gisnet.egisfil.service.ServiciosService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
