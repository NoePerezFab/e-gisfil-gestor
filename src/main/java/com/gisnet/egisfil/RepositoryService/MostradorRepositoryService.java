
package com.gisnet.egisfil.RepositoryService;

import com.gisnet.egisfil.domain.Mostrador;
import com.gisnet.egisfil.repository.MostradorRepository;
import com.gisnet.egisfil.service.MostradorService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MostradorRepositoryService implements MostradorService{
    @Autowired
    MostradorRepository repo;
    @Override
    public Optional<Mostrador> findOne(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Mostrador> findAll() {
        List<Mostrador> lista = new ArrayList<>();
        Iterator it = repo.findAll().iterator();
        while(it.hasNext()){
            lista.add((Mostrador)it.next());
        }
        return lista;
    }

    @Override
    public Mostrador create(Mostrador mostrador) {
        return repo.save(mostrador);
    }

    @Override
    public Mostrador update(Mostrador mostrador) {
        return repo.save(mostrador);
    }
    
}
