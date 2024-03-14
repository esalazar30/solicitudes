package com.semillero.solicitudes.controllers;
import com.semillero.solicitudes.persistence.entities.RolEntity;
import com.semillero.solicitudes.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
public class RolController {
    private RolService rolService;

    @Autowired
    public RolController(RolService rolService){
        this.rolService = rolService;
    }
    @GetMapping("/")
    public List<RolEntity> getAllRoles(){
        return  rolService.getAllRoles();
    }
    @PostMapping("/")
    public RolEntity crearRol(@RequestBody RolEntity rol){
        return rolService.crearRol(rol);
    }
    @PutMapping("/{id}")
    public  RolEntity actualizarRol(@RequestBody RolEntity rol, @PathVariable Integer id){
        return rolService.actualizarRol(rol, id);
    }
    @GetMapping("/by_nombre")
    public ResponseEntity<RolEntity> getRolesByNombre(@RequestParam String ds_rol){
        Optional<RolEntity>rol = rolService.getByRol(ds_rol);
        if(rol.isPresent()){
            return new ResponseEntity<>(rol.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
