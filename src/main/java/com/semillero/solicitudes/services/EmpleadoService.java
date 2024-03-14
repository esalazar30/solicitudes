package com.semillero.solicitudes.services;

import com.semillero.solicitudes.persistence.entities.EmpleadoEntity;
import com.semillero.solicitudes.persistence.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    private EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService (EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public List<EmpleadoEntity> getAllEmpleados(){
        return empleadoRepository.findAll();
    }
    public EmpleadoEntity crearEmpleado(EmpleadoEntity empleado){
        return empleadoRepository.save(empleado);
    }
    public EmpleadoEntity actualizarEmpleado(EmpleadoEntity empleado, Integer id){
        return empleadoRepository.findById(id).map(
                empleadoAct -> {
                    empleadoAct.setDs_nombre(empleado.getDs_nombre());
                    empleadoAct.setDs_apellido(empleado.getDs_apellido());
                    empleadoAct.setDs_direccion(empleado.getDs_direccion());
                    empleadoAct.setDs_telefono(empleado.getDs_telefono());
                    empleadoAct.setDs_tipo_documento(empleado.getDs_tipo_documento());
                    empleadoAct.setNm_documento(empleado.getNm_documento());
                    empleadoAct.setDs_estado_empleado(empleado.getDs_estado_empleado());
                    empleadoAct.setDs_tipo_contrato(empleado.getDs_tipo_contrato());
                    empleadoAct.setNm_cargo(empleado.getNm_cargo());
                    empleadoAct.setNm_supervisor_inmediato(empleado.getNm_supervisor_inmediato());
                    return empleadoRepository.save(empleadoAct);
                }
        ).get();
    }
    public Optional<EmpleadoEntity> getByName(String ds_nombre, String ds_apellido) {
        return empleadoRepository.findByFirstNameAndLastName(ds_nombre, ds_apellido);
    }
}
