package com.semillero.solicitudes.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.api.client.util.DateTime;
import jnr.ffi.Struct;
import org.checkerframework.checker.units.qual.C;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "alerta")

public class AlertaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer nm_id_alerta;
    @Column(name = "asunto")
    private String ds_asunto;
    @Column(name = "destinario")
    private String ds_destinario;
    @Column(name = "contenido")
    private String ds_contenido_alerta;
    @Column(name = "estado")
    private String ds_estado_alerta;
    @Column(name = "fechaCreacion")
    private DateTime fe_fecha_creacion;

    private List<AlertaEntity> alerta;
    public Integer getNm_id_alerta(){
        return nm_id_alerta;
    }
    public AlertaEntity(){

    }
    public AlertaEntity(Integer id){
        this.nm_id_alerta = id;
    }
    public void setNm_id_alerta(Integer nm_id_alerta){
        this.nm_id_alerta = nm_id_alerta;
    }
    public String getDs_asunto(){
        return ds_asunto;
    }
    public void setDs_asunto(String ds_asunto){
        this.ds_asunto = ds_asunto;
    }
    public String getDs_destinario(){
        return ds_destinario;
    }
    public void setDs_destinario(String ds_destinario){
        this.ds_destinario = ds_destinario;
    }
    public String getDs_contenido_alerta(){
        return ds_contenido_alerta;
    }
    public void setDs_contenido_alerta(String ds_contenido_alerta){
        this.ds_contenido_alerta = ds_contenido_alerta;
    }
    public String getDs_estado_alerta(){
        return ds_estado_alerta;
    }
    public void setDs_estado_alerta(String ds_estado_alerta){
        this.ds_estado_alerta = ds_estado_alerta;
    }
    public DateTime getFe_fecha_creacion(){
        return fe_fecha_creacion;
    }
    public void setFe_fecha_creacion(DateTime fe_fecha_creacion){
        this.fe_fecha_creacion = fe_fecha_creacion;
    }
    public List<AlertaEntity> getAlerta(){return alerta;}
    public void setAlerta(List<AlertaEntity> alerta){
        this.alerta = alerta;
    }
}
