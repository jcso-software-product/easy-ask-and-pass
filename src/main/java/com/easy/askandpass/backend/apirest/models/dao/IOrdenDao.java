package com.easy.askandpass.backend.apirest.models.dao;

import com.easy.askandpass.backend.apirest.models.entity.EstadoPedido;
import org.springframework.data.repository.CrudRepository;

import com.easy.askandpass.backend.apirest.models.entity.Orden;

import java.time.LocalDate;
import java.util.List;

public interface IOrdenDao extends CrudRepository<Orden, Long>{

    List<Orden> findByCreateAtAndEstado(LocalDate fecha, EstadoPedido estado);

}
