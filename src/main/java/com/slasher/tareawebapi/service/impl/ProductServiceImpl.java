package com.slasher.tareawebapi.service.impl;

import com.slasher.tareawebapi.entity.Product;
import com.slasher.tareawebapi.repository.ProductRepository;
import com.slasher.tareawebapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return ((List<Product>) productRepository.findAll());
    }
}
