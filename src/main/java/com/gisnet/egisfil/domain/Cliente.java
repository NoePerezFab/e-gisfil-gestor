
package com.gisnet.egisfil.domain;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.repository.Collection;
import org.springframework.data.couchbase.repository.Scope;

@Scope("configuracion")
@Collection("cliente")
@Document
public class Cliente {
    @Id
    private String id;
    
    @Field 
    private String numero_cliente;
    
    @Field 
    private String numero_tarjeta;
    
    @Field 
    private String rfc;

    @Field
    private String nombre;
    
    @Field
    private String apellidos;
    
    @Field
    private Date fecha_nacimiento;
    
    @Field
    private boolean activo;
    
    @Field
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    public String getId() {
        return id;
    }



    public String getNumero_cliente() {
        return numero_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public String getRfc() {
        return rfc;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumero_cliente(String numero_cliente) {
        this.numero_cliente = numero_cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    
    
}
