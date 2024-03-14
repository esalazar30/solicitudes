package com.semillero.solicitudes.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.api.client.util.DateTime;
import jnr.ffi.Struct;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "usuario")

public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer nm_id_usuario;
    @Column(name = "id_empleado")
    private Integer nm_id_empleado;
    @Column(name = "usuario")
    private String ds_usaurio;
    @Column(name = "fechaCreacion")
    private Date fe_fecha_creacion;
    @Column(name = "activo")
    private String ds_activo;
    @Column(name = "contraseña")
    private String ds_contraseña;
    @Column(name = "rol")
    private Integer nm_rol;

    /*@ManyToOne
    @JsonBackReference
    @JoinColumn(name = "nm_id_empleado")
    private EmpleadoEntity empleado;
    */
    public UsuarioEntity(){

    }
    public UsuarioEntity(Integer id) {
        this.nm_id_usuario = id;
    }
    public void setNm_id_usuario(Integer nm_id_usuario) {
        this.nm_id_usuario = nm_id_usuario;
    }
    public Integer getNm_id_empleado(){
        return nm_id_empleado;
    }
    public void setNm_id_empleado(Integer nm_id_empleado){
        this.nm_id_empleado = nm_id_empleado;
    }
    public String getDs_usaurio(){
        return ds_usaurio;
    }
    public void setDs_usaurio(String ds_usaurio){
        this.ds_usaurio = ds_usaurio;
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
    public String getDs_contraseña (){
        return ds_contraseña;
    }
    public void setDs_contraseña (String ds_contraseña){
        this.ds_contraseña = ds_contraseña;
    }
    public Integer getNm_rol (){
        return nm_rol;
    }
    public void setNm_rol (Integer nm_rol){
        this.nm_rol = nm_rol;
    }





}
