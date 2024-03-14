package com.semillero.solicitudes.persistence.repository;

import com.semillero.solicitudes.persistence.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
//Revisar
public interface UsuarioRepository extends JpaRepository <UsuarioEntity, Integer> {
    Optional<UsuarioEntity> findByUsuario (String ds_usaurio);
}
