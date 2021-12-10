
package com.gisnet.egisfil.gestor.RepositoryService;

import com.gisnet.egisfil.gestor.domain.Colonia;
import com.gisnet.egisfil.gestor.repository.ColoniaRepository;
import com.gisnet.egisfil.gestor.service.ColoniaService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;


public class ColoniaRepositoryService implements ColoniaService {
    @Autowired
    ColoniaRepository repo;
    @Override
    public Optional<Colonia> findOne(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Colonia> findAll() {
       List<Colonia> lista = new ArrayList<>();
        Iterator it = repo.findAll().iterator();
        while(it.hasNext()){
            lista.add((Colonia)it.next());
        }
        return lista;
    }

    @Override
    public Colonia create(Colonia colonia) {
        return repo.save(colonia);
    }

    @Override
    public Colonia update(Colonia colonia) {
        return repo.save(colonia);
    }
    
}
