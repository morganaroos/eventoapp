package com.eventoapp.demo.repository;

import com.eventoapp.demo.models.Convidado;
import com.eventoapp.demo.models.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByRg(String rg);

}
