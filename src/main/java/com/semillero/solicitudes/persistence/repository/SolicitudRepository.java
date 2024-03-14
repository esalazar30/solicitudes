package com.semillero.solicitudes.persistence.repository;

import com.semillero.solicitudes.persistence.entities.UsuarioEntity;
import com.semillero.solicitudes.persistence.entities.SolicitudEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SolicitudRepository extends JpaRepository<SolicitudEntity, Integer> {
    Optional<SolicitudEntity> findByIdUsuario (Integer nm_id_usuario);
}
