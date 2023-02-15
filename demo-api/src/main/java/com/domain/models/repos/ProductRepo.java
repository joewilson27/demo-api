package com.domain.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {
    // tanpa kita tulis function CRUD disini, namun repo interface ini 
    // sudah otomatis memiliki fungsi CRUD karena extend ke CrudRepository ini
}
