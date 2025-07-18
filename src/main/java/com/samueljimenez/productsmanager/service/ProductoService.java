package com.samueljimenez.productsmanager.service;

import com.samueljimenez.productsmanager.model.Producto;
import com.samueljimenez.productsmanager.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    public Producto saveProduct(Producto producto) {
        return productoRepository.save(producto);
    }

    public void deleteProduct(Long id) {
        productoRepository.deleteById(id);
    }
}
