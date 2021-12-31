
package com.gisnet.egisfil.util;

import com.gisnet.egisfil.domain.Servicios;
import com.gisnet.egisfil.domain.Sucursal;
import java.io.Serializable;


public class AddServiceRequest implements Serializable{
    
    private Servicios servicio;
    
    private Sucursal sucursal;

    public Servicios getServicio() {
        return servicio;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setServicio(Servicios servicio) {
        this.servicio = servicio;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
    
    
}
