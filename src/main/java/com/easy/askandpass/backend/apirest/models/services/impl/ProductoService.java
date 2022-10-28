package com.easy.askandpass.backend.apirest.models.services.impl;

import com.easy.askandpass.backend.apirest.models.dao.IProductoDao;
import com.easy.askandpass.backend.apirest.models.entity.Producto;
import com.easy.askandpass.backend.apirest.models.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    IProductoDao productoDao;

    @Override
    public Producto crearProducto(Producto producto) {
        return productoDao.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoDao.deleteById(id);
    }

    @Override
    public Page<Producto> findAllProducts(Pageable pageable) {
        return productoDao.findAll(pageable);
    }

    @Override
    public Producto findProductoById(Long id) {
        return productoDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Producto con ID " + id + " no esta registrado."));
    }
}
