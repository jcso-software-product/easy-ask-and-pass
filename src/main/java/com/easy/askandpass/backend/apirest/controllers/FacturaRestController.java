package com.easy.askandpass.backend.apirest.controllers;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.easy.askandpass.backend.apirest.models.entity.EstadoPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.easy.askandpass.backend.apirest.models.entity.Orden;
import com.easy.askandpass.backend.apirest.models.entity.Producto;
import com.easy.askandpass.backend.apirest.models.services.IClienteService;

@CrossOrigin(origins = { "http://localhost:4200", "*" })
@RestController
@RequestMapping("/api/facturas")
public class FacturaRestController {

	@Autowired
	private IClienteService clienteService;

	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Orden show(@PathVariable Long id) {
		return clienteService.findFacturaById(id);
	}
	
	@Secured({"ROLE_ADMIN"})
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.deleteFacturaById(id);
	}
	

	@GetMapping("/filtrar-productos/{term}")
	@ResponseStatus(HttpStatus.OK)
	public List<Producto> filtrarProductos(@PathVariable String term){
		return clienteService.findProductoByNombre(term);
	}

	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Orden crear(@RequestBody Orden factura) {
		return clienteService.saveFactura(factura);
	}

	@GetMapping("/estado/{estado}")
	@ResponseStatus(HttpStatus.OK)
	public List<Orden> findByEstado(@PathVariable EstadoPedido estado){

		return clienteService.findOrdenByEstado(LocalDate.now(), estado);
	}

}
