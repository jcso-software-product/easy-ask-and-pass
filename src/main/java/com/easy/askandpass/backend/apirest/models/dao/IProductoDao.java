package com.easy.askandpass.backend.apirest.models.dao;

import com.easy.askandpass.backend.apirest.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductoDao extends JpaRepository<Producto, Long> {

	@Query("select p from Producto p where p.nombre like %?1%")
	public List<Producto> findByNombre(String term);
	
	public List<Producto> findByNombreContainingIgnoreCase(String term);
	
	public List<Producto> findByNombreStartingWithIgnoreCase(String term);
}
