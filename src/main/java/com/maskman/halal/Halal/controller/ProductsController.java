package com.maskman.halal.Halal.controller;

import com.maskman.halal.Halal.entity.Product;
import com.maskman.halal.Halal.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/products")
public class ProductsController {

    @Autowired
    private ProductsService service;

    @GetMapping("/products")
    public Iterable<Product> getAll() {
       return service.getAll();
    }

    @GetMapping("/products/{id}")
    public Product get(@PathVariable String id) {
        return service.get(Long.decode(id)).get();
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable String id) {
        service.delete(Long.decode(id));
    }

    @PostMapping("/products")
    public void add(@RequestBody Product product) {
        service.save(product);
    }
}
