package com.semillero.solicitudes.persistence.repository;

import com.semillero.solicitudes.persistence.entities.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import java.util.List;
import java.util.Optional;

@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Integer>{
    Optional<EmpleadoEntity> findByFirstNameAndLastName (String ds_nombre, String ds_apellido);
}
