package com.semillero.solicitudes.controllers;

import com.semillero.solicitudes.persistence.entities.AlertaEntity;
import com.semillero.solicitudes.services.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alertas")
public class AlertaController {
    private AlertaService alertaService;

    @Autowired
    public AlertaController(AlertaService alertaService){
        this.alertaService = alertaService;
    }
    @GetMapping("/")
    public List<AlertaEntity> getAllAlerta(){return alertaService.getAllAlerta();}

    @PostMapping("/")
    public AlertaEntity crearAlerta(@RequestBody AlertaEntity alerta){
        return alertaService.crearAlerta(alerta);
    }
    @PutMapping("/{id}")
    public AlertaEntity actualizarAlerta(@RequestBody AlertaEntity alerta, @PathVariable Integer id){
        return alertaService.actualizarAlerta(alerta, id);
    }
    @GetMapping("/by_destinatario")
    public ResponseEntity<AlertaEntity> getAlertasByDestinatario(@RequestParam String ds_destinatario, @RequestParam String ds_asunto){
        Optional<AlertaEntity>alerta = alertaService.getByDestinatario(ds_destinatario, ds_asunto);
        if (alerta.isPresent()){
            return new ResponseEntity<>(alerta.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
