package com.semillero.solicitudes.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.api.client.util.DateTime;
import jnr.ffi.Struct;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "empleado")

public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer nm_id_empleado;
    @Column(name = "documento")
    private Integer nm_documento;
    @Column(name = "tipoDocumento")
    private String ds_tipo_documento;
    @Column(name = "nombre")
    private String ds_nombre;
    @Column(name = "apellido")
    private String ds_apellido;
    @Column(name = "telefono")
    private String ds_telefono;
    @Column(name = "dirección")
    private String ds_direccion;
    @Column(name = "fechaIngreso")
    private Date fe_fecha_ingreso;
    @Column(name = "fechaRetiro")
    private Date fe_fecha_retiro;
    @Column(name = "tipoContrato")
    private String ds_tipo_contrato;
    @Column(name = "estadoEmpleado")
    private String ds_estado_empleado;
    @Column(name = "supervisor")
    private Integer nm_supervisor_inmediato;
    @Column(name = "cargo")
    private Integer nm_cargo;

    private List<UsuarioEntity> usuarios;
    public Integer getNm_id_empleado() {
        return nm_id_empleado;
    }

    public EmpleadoEntity(){

    }
    public EmpleadoEntity(Integer id){
        this.nm_id_empleado = id;
    }
    public void setNm_id_empleado(Integer nm_id_empleado){
        this.nm_id_empleado = nm_id_empleado;
    }
    public Integer getNm_documento() {
        return nm_documento;
    }
    public void setNm_documento(Integer nm_documento) {
        this.nm_documento = nm_documento;
    }
    public String getDs_tipo_documento() {
        return ds_tipo_documento;
    }
    public void setDs_tipo_documento(String ds_tipo_documento) {
        this.ds_tipo_documento = ds_tipo_documento;
    }
    public String getDs_nombre() {
        return ds_nombre;
    }
    public void setDs_nombre(String ds_nombre) {
        this.ds_nombre = ds_nombre;
    }
    public String getDs_apellido() {
        return ds_apellido;
    }
    public void setDs_apellido(String ds_apellido) {
        this.ds_apellido = ds_apellido;
    }
    public String getDs_telefono(){
        return ds_telefono;
    }
    public void setDs_telefono(String ds_telefono){
        this.ds_telefono = ds_telefono;
    }
    public String getDs_direccion(){
        return ds_direccion;
    }
    public void setDs_direccion(String ds_direccion) {
        this.ds_direccion = ds_direccion;
    }
    public Date getFe_fecha_ingreso(){
        return fe_fecha_ingreso;
    }
    public void setFe_fecha_ingreso(Date fe_fecha_ingreso) {
        this.fe_fecha_ingreso = fe_fecha_ingreso;
    }
    public Date getFe_fecha_retiro(){
        return fe_fecha_retiro;
    }
    public void setFe_fecha_retiro(Date fe_fecha_retiro){
        this.fe_fecha_retiro =  fe_fecha_retiro;
    }
    public String getDs_tipo_contrato(){
        return ds_tipo_contrato;
    }
    public void setDs_tipo_contrato(String ds_tipo_contrato){
        this.ds_tipo_contrato = ds_tipo_contrato;
    }
    public String getDs_estado_empleado(){
        return ds_estado_empleado;
    }
    public void setDs_estado_empleado(String ds_estado_empleado){
        this.ds_estado_empleado = ds_estado_empleado;
    }
    public Integer getNm_supervisor_inmediato(){
        return nm_supervisor_inmediato;
    }
    public void setNm_supervisor_inmediato(Integer nm_supervisor_inmediato){
        this.nm_supervisor_inmediato = nm_supervisor_inmediato;
    }
    public Integer getNm_cargo(){
        return nm_cargo;
    }
    public void setNm_cargo(Integer nm_cargo){
        this.nm_cargo = nm_cargo;
    }
    public List<UsuarioEntity> getUsuarios(){
        return usuarios;
    }
    public void setUsuarios(List<UsuarioEntity> usuarios){
        this.usuarios = usuarios;
    }

}
