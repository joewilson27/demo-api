package com.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.models.entities.Product;
import com.domain.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    // Controller manggil -> Service manggil -> Repository
    @Autowired
    private ProductService productService;

    @PostMapping // nanti requestbody dikirim dari client
    public Product create(@RequestBody Product product) {
      return productService.save(product);
    }

    public Iterable<Product> findAll() {
      return productService.findAll();
    }

}
