package com.forohub.Forohub.services;

import com.forohub.Forohub.models.Usuarios;
import com.forohub.Forohub.repositories.IUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosServices {
    private IUsuariosRepository usuariosRepo;
    @Autowired

    public UsuariosServices(IUsuariosRepository usuariosRepo) {
        this.usuariosRepo = usuariosRepo;
    }

    //Metodo para crear usuarios
    public void crearUsuario(Usuarios usuarios) {
        usuariosRepo.save(usuarios);
    }

    //Metodo para listar usuarios
    public List<Usuarios> listarUsuario() {
        return usuariosRepo.findAll();
    }

    //Metodo para actualizar usuario
    public void actualizarUsuario(Usuarios usuario) {
        usuariosRepo.save(usuario);
    }

    //Metodo para eliminar por Id
    public void eliminarPorId(Long id) {
        usuariosRepo.deleteById(id);
    }

    //Metodo para buscar por Id
    public Optional<Usuarios> buscarPorId(Long id) {
        return usuariosRepo.findById(id);
    }

    //Metodo para buscar por perfiles
    public List<Usuarios> buscarPorPerfiles(String perfiles) {
        return usuariosRepo.findByPerfiles(perfiles);
    }
}
