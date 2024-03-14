package com.semillero.solicitudes.controllers;

import com.semillero.solicitudes.persistence.entities.EmpleadoEntity;
import com.semillero.solicitudes.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    private EmpleadoService empleadoService;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService){
        this.empleadoService = empleadoService;
    }

    @GetMapping("/")
    public List<EmpleadoEntity> getAllEmpleados() {
        return empleadoService.getAllEmpleados();
    }

    @PostMapping("/")
    public EmpleadoEntity crearEmpleado(@RequestBody EmpleadoEntity empleado) {
        return empleadoService.crearEmpleado(empleado);
    }
    @PutMapping("/{id}")
    public EmpleadoEntity actualizarEmpleado(@RequestBody EmpleadoEntity empleado, @PathVariable Integer id) {
        return empleadoService.actualizarEmpleado(empleado, id);
    }
    @GetMapping("/by_nombre")
    public ResponseEntity<EmpleadoEntity> getEmpleadosByNombre(@RequestParam String ds_nombre, @RequestParam String ds_apellido) {
        Optional<EmpleadoEntity>empleado = empleadoService.getByName(ds_nombre,ds_apellido);
        if(empleado.isPresent()) {
            return new ResponseEntity<>(empleado.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
