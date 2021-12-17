
package com.gisnet.egisfil.RepositoryService;

import com.gisnet.egisfil.domain.Sucursal;
import com.gisnet.egisfil.domain.Tipo_servicio;
import com.gisnet.egisfil.repository.Tipo_servicioRepository;
import com.gisnet.egisfil.service.Tipo_servicioService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Tipo_servicioRepositoryService implements Tipo_servicioService{
    @Autowired
    Tipo_servicioRepository repo;
    
    @Override
     public Optional<Tipo_servicio> findOne(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Tipo_servicio> findAll() {
        List<Tipo_servicio> lista = new ArrayList<>();
        Iterator it = repo.findAll().iterator();
        while(it.hasNext()){
            lista.add((Tipo_servicio)it.next());
        }
        return lista;
    }

    @Override
    public Tipo_servicio create(Tipo_servicio tipoServicio) {
        return repo.save(tipoServicio);
    }

    @Override
    public Tipo_servicio update(Tipo_servicio tipoServicio) {
        return repo.save(tipoServicio);
    }
    
}
