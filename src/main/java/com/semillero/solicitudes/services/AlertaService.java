package com.semillero.solicitudes.services;

import com.semillero.solicitudes.persistence.entities.AlertaEntity;
import com.semillero.solicitudes.persistence.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertaService {
    private AlertaRepository alertaRepository;

    @Autowired
    public AlertaService (AlertaRepository alertaRepository){
        this.alertaRepository = alertaRepository;
    }
    public List<AlertaEntity> getAllAlerta(){
        return alertaRepository.findAll();
    }
    public AlertaEntity crearAlerta(AlertaEntity alerta){
        return alertaRepository.save(alerta);
    }
    public AlertaEntity actualizarAlerta(AlertaEntity alerta, Integer id){
        return alertaRepository.findById(id).map(
                alertaAct -> {
                    alertaAct.setDs_asunto(alerta.getDs_asunto());
                    alertaAct.setDs_destinario(alerta.getDs_destinario());
                    alertaAct.setDs_contenido_alerta(alerta.getDs_contenido_alerta());
                    alertaAct.setDs_estado_alerta(alerta.getDs_estado_alerta());
                    alertaAct.setFe_fecha_creacion(alerta.getFe_fecha_creacion());
                    return alertaRepository.save(alertaAct);
                }
        ).get();
    }
    public Optional<AlertaEntity> getByDestinatario(String ds_destinatario, String ds_asunto){
        return alertaRepository.findByAsuntoAndFindByDestinatario(ds_destinatario, ds_asunto);
    }
}
