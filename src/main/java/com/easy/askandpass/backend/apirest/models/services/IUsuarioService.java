package com.easy.askandpass.backend.apirest.models.services;

import com.easy.askandpass.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	Usuario findByUsername(String username);
	Usuario createUser(Usuario usuario);
}
