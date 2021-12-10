
package com.gisnet.egisfil.gestor.service;


import com.gisnet.egisfil.gestor.domain.Sucursal;
import java.util.List;
import java.util.Optional;

public interface SucursalService {
    Optional<Sucursal> findOne(String id);
    List<Sucursal> findAll();
    Sucursal create(Sucursal sucursal);
    Sucursal update(Sucursal sucursal);
}
