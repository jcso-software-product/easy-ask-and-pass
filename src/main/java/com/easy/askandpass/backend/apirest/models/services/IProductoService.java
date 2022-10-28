package com.easy.askandpass.backend.apirest.models.services;

import com.easy.askandpass.backend.apirest.models.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductoService {

    Producto crearProducto(Producto producto);
    void eliminarProducto(Long id);
    Page<Producto> findAllProducts(Pageable pageable);

    Producto findProductoById(Long id);

}
