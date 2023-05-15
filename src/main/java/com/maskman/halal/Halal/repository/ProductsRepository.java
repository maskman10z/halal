package com.maskman.halal.Halal.repository;

import com.maskman.halal.Halal.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Product, Long> {
}
