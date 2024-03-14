package com.semillero.solicitudes.services;

import com.semillero.solicitudes.persistence.repository.SolicitudRepository;
import com.semillero.solicitudes.persistence.entities.SolicitudEntity;
import com.semillero.solicitudes.services.interfaces.ISolicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitudService {
    private SolicitudRepository solicitudRepository;

    @Autowired
    public SolicitudService (SolicitudRepository solicitudRepository) {
        this.solicitudRepository = solicitudRepository;
    }
    public List<SolicitudEntity> getAllSolicitudes(){
        return solicitudRepository.findAll();
    }
    public SolicitudEntity crearSolicitud(SolicitudEntity solicitud){
        return solicitudRepository.save(solicitud);
    }
    public SolicitudEntity actualizarSolicitud(SolicitudEntity solicitud, Integer id){
        return solicitudRepository.findById(id).map(
                actualizarSol -> {
                actualizarSol.setNm_dias_solicita(solicitud.getNm_dias_solicita());
                actualizarSol.setFe_fecha_inicio(solicitud.getFe_fecha_inicio());
                actualizarSol.setFe_fecha_fin(solicitud.getFe_fecha_fin());
                actualizarSol.setFe_fecha_retorna(solicitud.getFe_fecha_retorna());
                actualizarSol.setFe_fecha_creacion(solicitud.getFe_fecha_creacion());
                actualizarSol.setDs_estado(solicitud.getDs_estado());
                actualizarSol.setDs_observaciones(solicitud.getDs_observaciones());
                return solicitudRepository.save(actualizarSol);
                }
        ).get();
    }
    public Optional<SolicitudEntity> getByUsuario(Integer nm_id_usuario){
        return solicitudRepository.findByIdUsuario(nm_id_usuario);
    }
}
