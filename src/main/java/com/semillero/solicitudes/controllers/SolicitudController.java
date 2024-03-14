package com.semillero.solicitudes.controllers;

import com.semillero.solicitudes.persistence.entities.SolicitudEntity;
import com.semillero.solicitudes.services.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {
    private SolicitudService solicitudService;

    @Autowired
    public SolicitudController(SolicitudService solicitudService) {
        this.solicitudService = solicitudService;
    }
    @GetMapping("/")
    public List<SolicitudEntity> getAllSolicitudes(){
        return solicitudService.getAllSolicitudes();
    }
    @PostMapping("/")
    public SolicitudEntity crearSolicitud(@RequestBody SolicitudEntity solicitud){
        return solicitudService.crearSolicitud(solicitud);
    }
    @PutMapping("/{id}")
    public SolicitudEntity actualizarSolicitud(@RequestBody SolicitudEntity solicitud, @PathVariable Integer id){
        return solicitudService.actualizarSolicitud(solicitud, id);
    }
    @GetMapping("/by_usuario")
    public ResponseEntity<SolicitudEntity> getSolicitudByUsuario(@RequestParam Integer nm_id_usuario){
        Optional<SolicitudEntity>solicitud = solicitudService.getByUsuario(nm_id_usuario);
        if(solicitud.isPresent()){
            return new ResponseEntity<>(solicitud.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
