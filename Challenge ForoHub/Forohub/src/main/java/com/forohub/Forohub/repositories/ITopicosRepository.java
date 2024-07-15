package com.forohub.Forohub.repositories;

import com.forohub.Forohub.models.Topicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicosRepository extends JpaRepository<Topicos, Long> {
}
