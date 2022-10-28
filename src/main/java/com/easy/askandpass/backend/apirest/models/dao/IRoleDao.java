package com.easy.askandpass.backend.apirest.models.dao;

import com.easy.askandpass.backend.apirest.models.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleDao extends CrudRepository<Role, Long> {

    Role findByNombre(String nombre);

}
