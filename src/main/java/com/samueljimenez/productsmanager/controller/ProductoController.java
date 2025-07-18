package com.samueljimenez.productsmanager.controller;

import com.samueljimenez.productsmanager.model.Producto;
import com.samueljimenez.productsmanager.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*") // Agregado para probar en local, por seguridad no debería ser así
public class ProductoController {


    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> getAll() {
        return productoService.getAll();
    }

    @PostMapping
    public Producto saveProduct(@Valid @RequestBody Producto producto) {
        return productoService.saveProduct(producto);
    }

    @PostMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productoService.deleteProduct(id);
    }

    @PostMapping("/seed")
    public void seed() {
        productoService.saveProduct(new Producto("Mouse", new BigDecimal("20.0"), 50));
        productoService.saveProduct(new Producto("Teclado", new BigDecimal("35.0"), 30));
        productoService.saveProduct(new Producto("Monitor", new BigDecimal("150.0"), 10));
    }
}
