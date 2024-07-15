package com.forohub.Forohub.repositories;

import com.forohub.Forohub.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios, Long>   {
    List<Usuarios> findByPerfiles(String perfiles);

    UserDetails findByNombre(String nombre);
}
