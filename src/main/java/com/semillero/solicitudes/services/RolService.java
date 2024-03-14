package com.semillero.solicitudes.services;

import com.semillero.solicitudes.persistence.entities.RolEntity;
import com.semillero.solicitudes.persistence.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {
    private RolRepository rolRepository;

    @Autowired
    public RolService (RolRepository rolRepository){
        this.rolRepository = rolRepository;
    }

    public List<RolEntity> getAllRoles(){
        return rolRepository.findAll();
    }
    public RolEntity crearRol(RolEntity rol){
        return rolRepository.save(rol);
    }
    public RolEntity actualizarRol(RolEntity rol,Integer id){
        return rolRepository.findById(id).map(
                rolAct -> {
                    rolAct.setDs_rol(rol.getDs_rol());
                    return rolRepository.save(rolAct);
                }
        ).get();
    }
    public Optional<RolEntity> getByRol(String ds_rol){
        return rolRepository.findByRol(ds_rol);
    }
}
