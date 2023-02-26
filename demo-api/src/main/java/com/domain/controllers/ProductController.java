package com.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping // get all data
    public Iterable<Product> findAll() {
      return productService.findAll();
    }

    @GetMapping("/{id}") // kita tambah parameter disini untuk menangkap id yang di passing dari url saat request
    public Product findOne(@PathVariable("id") Long id) { // pathvariable ini untuk menghubungkan id yang dari @GetMapping      
          return productService.findOne(id);
    }

    @PutMapping // sebenarnya update bisa juga menggunakan fungsi create di atas yang @PostMapping, karena service product sudah pintar untuk mengetahui itu adalah update karena kita menambah parameter id saat me-request
    public Product update(@RequestBody Product product) {
      return productService.save(product);
    }

    @DeleteMapping("/{id}") // kita tambah parameter disini untuk menangkap id yang di passing dari url saat request
    public void removeOne(@PathVariable("id") Long id) { // pathvariable ini untuk menghubungkan id yang dari @GetMapping
      productService.removeOne(id);
    }

}
