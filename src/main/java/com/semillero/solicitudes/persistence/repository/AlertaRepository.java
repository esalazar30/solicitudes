package com.semillero.solicitudes.persistence.repository;

import com.semillero.solicitudes.persistence.entities.AlertaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import java.util.List;
import java.util.Optional;
@Repository
public interface AlertaRepository extends JpaRepository<AlertaEntity, Integer>{
    Optional<AlertaEntity> findByAsuntoAndFindByDestinatario (String ds_asunto, String ds_destinatario);
}
