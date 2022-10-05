package com.eventoapp.demo.repository;

import com.eventoapp.demo.models.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<Evento, String> {
    Evento findById(long id);

}
