
package com.gisnet.egisfil.gestor.RepositoryService;

import com.gisnet.egisfil.gestor.domain.Municipio;
import com.gisnet.egisfil.gestor.repository.MunicipioRepository;
import com.gisnet.egisfil.gestor.service.MunicipioService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;


public class MunicipioRepositoryService implements MunicipioService{
    @Autowired
    MunicipioRepository repo;
    @Override
    public Optional<Municipio> findOne(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Municipio> findAll() {
        List<Municipio> lista = new ArrayList<>();
        Iterator it = repo.findAll().iterator();
        while(it.hasNext()){
            lista.add((Municipio)it.next());
        }
        return lista;
    }

    @Override
    public Municipio create(Municipio municipio) {
       return repo.save(municipio);
    }

    @Override
    public Municipio update(Municipio municipio) {
        return repo.save(municipio);
    }
    
}
