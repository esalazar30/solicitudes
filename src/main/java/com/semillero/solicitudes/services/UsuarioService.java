package com.semillero.solicitudes.services;

import com.semillero.solicitudes.persistence.entities.UsuarioEntity;
import com.semillero.solicitudes.persistence.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService (UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    public  List<UsuarioEntity> getAllUsuarios(){
        return usuarioRepository.findAll();
    }
    public UsuarioEntity crearUsuario(UsuarioEntity usuario){
        return usuarioRepository.save(usuario);
    }
    public UsuarioEntity actualizarUsuario(UsuarioEntity usuario, Integer id){
        return usuarioRepository.findById((id)).map(
                usuarioAct -> {
                    usuarioAct.setDs_usaurio(usuario.getDs_usaurio());
                    usuarioAct.setDs_contraseña(usuario.getDs_contraseña());
                    usuarioAct.setNm_rol(usuario.getNm_rol());
                    usuarioAct.setDs_activo(usuario.getDs_activo());
                    return usuarioRepository.save(usuarioAct);
                }
        ).get();
    }
    public Optional<UsuarioEntity> getByUsuario(String ds_usaurio){
        return usuarioRepository.findByUsuario (ds_usaurio);
    }
}
