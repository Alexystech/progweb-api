package com.slasher.tareawebapi.service;

import com.slasher.tareawebapi.entity.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);
    List<Product> getAllProducts();
}
