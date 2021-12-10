
package com.gisnet.egisfil.gestor.domain;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Document
public class Mostrador implements Serializable{
    
    @Id
    private String id;
    
    @Field
    private String clave;
    
    @Field
    private String nombre;
    
    @Field
    private String tipo_servicio;
    
    @Field
    private boolean activo;

    @Field
    private String type = "mostrador";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    public String getId() {
        return id;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
