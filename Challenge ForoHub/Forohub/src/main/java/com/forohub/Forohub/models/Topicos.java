package com.forohub.Forohub.models;

import com.forohub.Forohub.dto.DatosActualizarTopico;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Topicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topico_id")
    private Long topico_id;
    private String titulo;
    private String mensaje;
    @CreationTimestamp
    private Instant fechaDeCreacion;
    @UpdateTimestamp
    private Instant ultimaActualizacion;
    private String status;
    private String autor;
    private String curso;
    private int respuestas;

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.status() != null){
            this.status = datosActualizarTopico.status();
        }
        if (datosActualizarTopico.respuestas() != 0){
            this.respuestas = datosActualizarTopico.respuestas();
        }
    }
}