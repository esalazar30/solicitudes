package com.semillero.solicitudes.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.api.client.util.DateTime;
import jnr.ffi.Struct;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "solicitud_vacaciones")
public class SolicitudEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer nm_id_solicitud;
    @Column(name = "idUsuario")
    private Integer nm_id_usuario;
    @Column(name = "diasSolicitados")
    private Integer nm_dias_solicita;
    @Column(name = "fechaInicio")
    private Date fe_fecha_inicio;
    @Column(name = "fechaFin")
    private Date fe_fecha_fin;
    @Column(name = "fechaRetorno")
    private Date fe_fecha_retorna;
    @Column(name = "estado")
    private String ds_estado;
    @Column(name = "observaciones")
    private String ds_observaciones;
    @Column(name = "fechaCreacion")
    private DateTime fe_fecha_creacion;

    private List<SolicitudEntity> solicitud;
    public Integer getNm_id_solicitud(){
        return nm_id_solicitud;
    }

    public SolicitudEntity(){}
    public SolicitudEntity(Integer id){
        this.nm_id_solicitud = id;
    }
    public void setNm_id_solicitud(Integer nm_id_solicitud){
        this.nm_id_solicitud = nm_id_solicitud;
    }
    public Integer getNm_id_usuario(){return nm_id_usuario;}
    public void setNm_id_usuario(Integer nm_id_usuario){this.nm_id_usuario = nm_id_usuario;}
    public Integer getNm_dias_solicita() {
        return nm_dias_solicita;
    }
    public void setNm_dias_solicita(Integer nm_dias_solicita){
        this.nm_dias_solicita = nm_dias_solicita;
    }
    public Date getFe_fecha_inicio() {
        return fe_fecha_inicio;
    }
    public void setFe_fecha_inicio(Date fe_fecha_inicio){
        this.fe_fecha_inicio = fe_fecha_inicio;
    }
    public Date getFe_fecha_fin() {
        return fe_fecha_fin;
    }
    public void setFe_fecha_fin(Date fe_fecha_fin) {
        this.fe_fecha_fin = fe_fecha_fin;
    }
    public Date getFe_fecha_retorna() {
        return fe_fecha_retorna;
    }
    public void setFe_fecha_retorna(Date fe_fecha_retorna) {
        this.fe_fecha_retorna = fe_fecha_retorna;
    }
    public String getDs_estado(){
        return ds_estado;
    }
    public void setDs_estado(String ds_estado){
        this.ds_estado = ds_estado;
    }
    public String getDs_observaciones(){
        return ds_observaciones;
    }
    public void setDs_observaciones(String ds_observaciones){
        this.ds_observaciones = ds_observaciones;
    }
    public DateTime getFe_fecha_creacion(){
        return fe_fecha_creacion;
    }
    public void setFe_fecha_creacion(DateTime fe_fecha_creacion){
        this.fe_fecha_creacion = fe_fecha_creacion;
    }
    public List<SolicitudEntity> getSolicitud(){
        return solicitud;
    }
    public void setSolicitud(List<SolicitudEntity> solicitud){
        this.solicitud = solicitud;
    }
}
