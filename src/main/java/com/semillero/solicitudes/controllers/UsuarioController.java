package com.semillero.solicitudes.controllers;

import com.semillero.solicitudes.persistence.entities.UsuarioEntity;
import com.semillero.solicitudes.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    @GetMapping("/")
    public List<UsuarioEntity> getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    }
    @PostMapping("/")
    public UsuarioEntity crearUsuario(@RequestBody UsuarioEntity usuario){
        return usuarioService.crearUsuario(usuario);
    }
    @PutMapping("/{id}")
    public UsuarioEntity actualizarUsuario(@RequestBody UsuarioEntity usuario, @PathVariable Integer id){
        return usuarioService.actualizarUsuario(usuario, id);
    }
    @GetMapping("/by_usuario")
    public ResponseEntity<UsuarioEntity> getUsuariosByUsuario(@RequestParam String ds_usaurio){
        Optional<UsuarioEntity>usuario = usuarioService.getByUsuario(ds_usaurio);
        if(usuario.isPresent()){
            return  new ResponseEntity<>(usuario.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
