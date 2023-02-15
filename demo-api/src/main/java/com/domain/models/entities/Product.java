package com.domain.models.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_product") // ini akan menjadi nama table di sisi mysql
public class Product implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id // jadikan primary key pada table mysql
    @GeneratedValue(strategy=GenerationType.IDENTITY) // jadikan auto-increment pada sisi mysql
    private Long id;

    @Column(name="product_name", length=100) // ini nanti di table akan membuat nama column product_name dan length 100 yang di generate JPA ke mysql nya
    private String name;

    @Column(name="product_description", length=500) // ini juga akan di generate JPA. intinya lain type database yg di gunakan, nanti tipe pada database akan menyesuaikan
    private String description;

    private double price;

    public Product() {
    }

    public Product(Long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

}
