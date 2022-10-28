package com.easy.askandpass.backend.apirest.models.services.impl;

import java.time.LocalDate;
import java.util.List;

import com.easy.askandpass.backend.apirest.models.dao.IClienteDao;
import com.easy.askandpass.backend.apirest.models.dao.IOrdenDao;
import com.easy.askandpass.backend.apirest.models.dao.IProductoDao;
import com.easy.askandpass.backend.apirest.models.entity.*;
import com.easy.askandpass.backend.apirest.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Autowired
	private IOrdenDao facturaDao;
	
	@Autowired
	private IProductoDao productoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Estudiante> findAll() {
		return (List<Estudiante>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Estudiante> findAll(Pageable pageable) {
		return clienteDao.findAll(pageable);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Estudiante findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Estudiante save(Estudiante cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	public Estudiante findByIdentificacion(String identificacion) {
		return clienteDao.findStudentByIdentificacion(identificacion);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Region> findAllRegiones() {
		return clienteDao.findAllRegiones();
	}

	@Override
	@Transactional(readOnly = true)
	public Orden findFacturaById(Long id) {
		return facturaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Orden saveFactura(Orden factura) {
		return facturaDao.save(factura);
	}

	@Override
	public List<Orden> findOrdenByEstado(LocalDate fecha, EstadoPedido estado) {
		return facturaDao.findByCreateAtAndEstado(fecha, estado);
	}

	@Override
	@Transactional
	public void deleteFacturaById(Long id) {
		facturaDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findProductoByNombre(String term) {
		return productoDao.findByNombreContainingIgnoreCase(term);
	}

}
