package com.easy.askandpass.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.easy.askandpass.backend.apirest.models.entity.Estudiante;
import com.easy.askandpass.backend.apirest.models.entity.Region;

public interface IClienteDao extends JpaRepository<Estudiante, Long>{

	@Query("from Region")
	List<Region> findAllRegiones();

	Estudiante findStudentByIdentificacion(String identificacion);

}
