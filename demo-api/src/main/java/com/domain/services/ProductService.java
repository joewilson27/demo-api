package com.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.models.entities.Product;
import com.domain.models.repos.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
    
    @Autowired // dependency injection
    private ProductRepo productRepo;

    // Create/Update
    public Product save(Product product) {
      return productRepo.save(product);
    }

    // Get detail of data
    public Product findOne(Long id) {
      return productRepo.findById(id).get();
    }

    // Get list of data
    public Iterable<Product> findAll() {
      return productRepo.findAll();
    }

    // Delete data
    public void removeOne(Long id) {
      productRepo.deleteById(id); 
    }

    // Find data by name
    public List<Product> findByName(String name) {
      return productRepo.findByNameContains(name);
    }
}
