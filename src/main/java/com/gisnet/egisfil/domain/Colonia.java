
package com.gisnet.egisfil.domain;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.repository.Collection;
import org.springframework.data.couchbase.repository.Scope;

@Scope("configuracion")
@Collection("colonia")
@Document
public class Colonia implements Serializable{
    
    @Id
    private String id;
    
    @Field
    private String clave;
    
    @Field
    private String nombre;
    
    @Field
    private String cp;

    @Field
    private String estado;
    
    @Field
    private String municipio;

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getCp() {
        return cp;
    }

    public String getEstado() {
        return estado;
    }
    
    @Field
    private String type = "colonia";

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
    



    public void setId(String id) {
        this.id = id;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
    
}
