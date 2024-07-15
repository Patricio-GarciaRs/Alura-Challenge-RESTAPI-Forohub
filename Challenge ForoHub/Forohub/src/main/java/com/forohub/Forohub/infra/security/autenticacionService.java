package com.forohub.Forohub.infra.security;

import com.forohub.Forohub.repositories.IUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class autenticacionService implements UserDetailsService {

    @Autowired
    private IUsuariosRepository usuariosRepository;

    @Override
    public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
        return usuariosRepository.findByNombre(nombre);
    }
}
