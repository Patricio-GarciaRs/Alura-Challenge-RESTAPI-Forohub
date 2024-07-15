package com.forohub.Forohub.services;

import com.forohub.Forohub.dto.DatosActualizarTopico;
import com.forohub.Forohub.models.Topicos;
import com.forohub.Forohub.models.Usuarios;
import com.forohub.Forohub.repositories.ITopicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicosServices {
    private ITopicosRepository topicosRepo;
    @Autowired

    public TopicosServices(ITopicosRepository topicosRepo) {
        this.topicosRepo = topicosRepo;
    }

    //Metodo para crear topicos
    public void crearTopico(Topicos topicos) {
        topicosRepo.save(topicos);
    }

    //Metodo para listar topicos
    public List<Topicos> listarTopicos() {
        return topicosRepo.findAll();
    }

    //Metodo para buscar por Id
    public Optional<Topicos> buscarPorId(Long id) {
        return topicosRepo.findById(id);
    }

    //Metodo para actualizar un topico
    public void actualizarTopico(DatosActualizarTopico datosActualizarTopico) {
        Topicos topicos = topicosRepo.getReferenceById(datosActualizarTopico.topico_id());
        topicos.actualizarDatos(datosActualizarTopico);
    }

    //Metodo para eliminar por Id
    public void eliminarPorId(Long id) {
        topicosRepo.deleteById(id);
    }
}
