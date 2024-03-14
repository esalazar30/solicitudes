package com.semillero.solicitudes.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.api.client.util.DateTime;
import jnr.ffi.Struct;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "rol_usuario")

public class RolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer nm_id_rol;
    @Column(name = "rol")
    private String ds_rol;
    @Column(name = "fechaCreacion")
    private Date fe_fecha_creacion;

    private List<RolEntity> roles;
    public Integer getNm_id_rol(){
        return nm_id_rol;
    }

    public RolEntity(){

    }
    public RolEntity(Integer id) {
        this.nm_id_rol = id;
    }
    public void setNm_id_rol(Integer nm_id_rol){
        this.nm_id_rol = nm_id_rol;
    }
    public String getDs_rol(){
        return ds_rol;
    }
    public void setDs_rol(String ds_rol){
        this.ds_rol = ds_rol;
    }
    public Date getFe_fecha_creacion(){
        return fe_fecha_creacion;
    }
    public void setFe_fecha_creacion(Date fe_fecha_creacion){
        this.fe_fecha_creacion = fe_fecha_creacion;
    }
    public List<RolEntity> getRoles(){
        return roles;
    }
    public void setRoles(List<RolEntity> roles) {
        this.roles = roles;
    }
}
