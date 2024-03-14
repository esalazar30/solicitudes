package com.semillero.solicitudes.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.api.client.util.DateTime;
import jnr.ffi.Struct;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cargos")

public class CargoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer nm_id_cargo;
    @Column(name = "cargo")
    private String ds_cargo;
    @Column(name = "descripcion")
    private String ds_descripcion;
    @Column(name = "fechaCreacion")
    private Date fe_fecha_creacion;
    @Column(name = "activo")
    private String ds_activo;

    private List<CargoEntity> cargos;
    public Integer getNm_id_cargo(){
        return nm_id_cargo;
    }
    public CargoEntity(){

    }
    public CargoEntity(Integer id) {
        this.nm_id_cargo = id;
    }
    public void  setNm_id_cargo(Integer nm_id_cargo){
        this.nm_id_cargo = nm_id_cargo;
    }
    public String getDs_cargo(){
        return ds_cargo;
    }
    public void setDs_cargo(String ds_cargo){
        this.ds_cargo = ds_cargo;
    }
    public String getDs_descripcion(){
        return ds_descripcion;
    }
    public void setDs_descripcion(String ds_descripcion){
        this.ds_descripcion ) ds_descripcion;
    }
    public Date getFe_fecha_creacion(){
        return fe_fecha_creacion;
    }
    public void setFe_fecha_creacion(Date fe_fecha_creacion){
        this.fe_fecha_creacion = fe_fecha_creacion;
    }
    public String getDs_activo(){
        return ds_activo;
    }
    public void setDs_activo(String ds_activo){
        this.ds_activo = ds_activo;
    }
    public List<CargoEntity> getCargos(){
        return cargos;
    }
    public void setCargos(List<CargoEntity> cargos){
        this.cargos = cargos;
    }
}
