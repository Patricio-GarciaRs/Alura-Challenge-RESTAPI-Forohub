package com.forohub.Forohub.controllers;

import com.forohub.Forohub.dto.DatosActualizarTopico;
import com.forohub.Forohub.models.Topicos;
import com.forohub.Forohub.models.Usuarios;
import com.forohub.Forohub.services.TopicosServices;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/topicos/")
public class TopicosRestController {

    private TopicosServices topicosServices;

    @Autowired
    public TopicosRestController(TopicosServices topicosServices) {
        this.topicosServices = topicosServices;
    }

    @PostMapping(value = "crearTopico", headers = "Accept=application/json")
    public void crearTopico(@RequestBody Topicos topicos) {
        topicosServices.crearTopico(topicos);
    }

    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Topicos> listarTopicos() {
        return topicosServices.listarTopicos();
    }

    @GetMapping(value = "buscarById/{id}", headers = "Accept=application/json")
    public Optional<Topicos> buscarPorId(@PathVariable Long id) {
        return topicosServices.buscarPorId(id);
    }

    @PutMapping(value = "actualizarTopico", headers = "Accept=application/json")
    @Transactional
    public void actualizarTopico(@RequestBody DatosActualizarTopico datosActualizarTopico) {
        topicosServices.actualizarTopico(datosActualizarTopico);
    }

    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void eliminarPorId(@PathVariable Long id) {
        topicosServices.eliminarPorId(id);
    }
}
