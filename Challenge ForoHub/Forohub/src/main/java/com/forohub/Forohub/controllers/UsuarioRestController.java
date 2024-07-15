package com.forohub.Forohub.controllers;

import com.forohub.Forohub.models.Usuarios;
import com.forohub.Forohub.services.UsuariosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios/")
public class UsuarioRestController {

    private UsuariosServices usuariosServices;

    @Autowired
    public UsuarioRestController(UsuariosServices usuariosServices) {
        this.usuariosServices = usuariosServices;
    }
    @PostMapping(value = "crearUsuario", headers = "Accept=application/json")
    public void crearUsuario(@RequestBody Usuarios usuarios) {
        usuariosServices.crearUsuario(usuarios);
    }
    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Usuarios> listarUsuario() {
        return usuariosServices.listarUsuario();
    }
    @GetMapping(value = "buscarById/{id}", headers = "Accept=application/json")
    public Optional<Usuarios> buscarPorId(@PathVariable Long id) {
        return usuariosServices.buscarPorId(id);
    }
    @PutMapping(value = "actualizarUsuario", headers = "Accept=application/json")
    public void actualizarUsuario(@RequestBody Usuarios usuarios) {
        usuariosServices.actualizarUsuario(usuarios);
    }
    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void eliminarPorId(@PathVariable Long id) {
        usuariosServices.eliminarPorId(id);
    }
}
