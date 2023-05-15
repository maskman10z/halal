package com.maskman.halal.Halal.service;

import com.maskman.halal.Halal.entity.Product;
import com.maskman.halal.Halal.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository repository;

    public Iterable<Product> getAll() {
        return repository.findAll();
    }

    public Optional<Product> get(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public void save(Product product) {
        repository.save(product);
    }
}
