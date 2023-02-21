package com.domain.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entities.Product;

// biasanya disebut DAO
public interface ProductRepo extends CrudRepository<Product, Long> {
    // tanpa kita tulis function CRUD disini, namun repo interface ini 
    // sudah otomatis memiliki fungsi CRUD karena extend ke CrudRepository ini
    // contohnya pada ProductService disana ProductRepo interface ini di inject dengan 
    // @Autowired dan kita bisa langsung menggunakan fungsi2 crud dari extends CrudRepository
    // ini, misalnya menggunakan fungsi .save(), .findById() dll

    // jika kita ingin memiliki fungsi yang tidak dimiliki oleh CrudRepository
    // maka kita harus menambahkannya sendiri.

    // contoh dibawah ini bisa dibilang derivated function yang artinya, si spring bisa tahu
    // maksud kita berdasarkan nama functionnya, pada contoh ini findByNameContains yang
    // nanti akan diartikan oleh spring untuk mencari data berdasarkan nama tanpa kita harus menulis 
    // query nya
    List<Product> findByNameContains(String name);
}
