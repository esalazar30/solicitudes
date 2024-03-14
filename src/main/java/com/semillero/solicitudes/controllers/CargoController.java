package com.semillero.solicitudes.controllers;

import com.semillero.solicitudes.persistence.entities.CargoEntity;
import com.semillero.solicitudes.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cargos")
public class CargoController {
    private CargoService cargoService;

    @Autowired
    public CargoController(CargoService cargoService){
        this.cargoService = cargoService;
    }

    @GetMapping("/")
    public CargoEntity crearCargo(@RequestBody CargoEntity cargo){
        return cargoService.crearCargo(cargo);
    }

    @PostMapping("/{id}")
    public CargoEntity actualizarCargo(@RequestBody CargoEntity cargo, @PathVariable Integer id){
        return cargoService.actualizarCargo(cargo, id);
    }

    @GetMapping("/by_cargo")
    public ResponseEntity<CargoEntity> getCargoByNombre(@RequestParam String ds_cargo, @RequestParam String ds_activo){
        Optional<CargoEntity>cargo = cargoService.getByCargo(ds_cargo, ds_activo);
        if(cargo.isPresent()){
            return new ResponseEntity<>(cargo.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
