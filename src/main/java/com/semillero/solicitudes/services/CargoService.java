package com.semillero.solicitudes.services;

import com.semillero.solicitudes.persistence.entities.CargoEntity;
import com.semillero.solicitudes.persistence.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {
    private CargoRepository cargoRepository;

    @Autowired
    public CargoService (CargoRepository cargoRepository){
        this.cargoRepository = cargoRepository;
    }
    public List<CargoEntity> getAllCargos(){
        return cargoRepository.findAll();
    }
    public CargoEntity crearCargo(CargoEntity cargo){
        return cargoRepository.save(cargo);
    }
    public CargoEntity actualizarCargo(CargoEntity cargo, Integer id){
        return cargoRepository.findById(id).map(
                cargoAct -> {
                    cargoAct.setDs_cargo(cargo.getDs_cargo());
                    cargoAct.setDs_descripcion(cargo.getDs_descripcion());
                    cargoAct.setDs_activo(cargo.getDs_activo());
                    return cargoRepository.save(cargoAct);
                }
        ).get();
    }
    public Optional<CargoEntity> getByCargo(String ds_cargo, String ds_activo){
        return cargoRepository.findByCargoOrActivo(ds_cargo, ds_activo);
    }
}
