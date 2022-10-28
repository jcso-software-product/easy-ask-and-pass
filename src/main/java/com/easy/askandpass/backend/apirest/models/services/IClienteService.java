package com.easy.askandpass.backend.apirest.models.services;

import com.easy.askandpass.backend.apirest.models.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

 public interface IClienteService {

     List<Estudiante> findAll();
	
     Page<Estudiante> findAll(Pageable pageable);

     Estudiante findById(Long id);

     Estudiante save(Estudiante cliente);

     Estudiante findByIdentificacion(String identificacion);

     void delete(Long id);

     List<Region> findAllRegiones();

     Orden findFacturaById(Long id);

     Orden saveFactura(Orden factura);

	 List<Orden> findOrdenByEstado(LocalDate fecha, EstadoPedido estado);

     void deleteFacturaById(Long id);

     List<Producto> findProductoByNombre(String term);

}
