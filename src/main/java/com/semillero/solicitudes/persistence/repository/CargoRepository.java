package com.semillero.solicitudes.persistence.repository;

import com.semillero.solicitudes.persistence.entities.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CargoRepository extends JpaRepository<CargoEntity, Integer> {
    Optional<CargoEntity> findByCargoOrActivo (String ds_cargo, String ds_activo);
}
