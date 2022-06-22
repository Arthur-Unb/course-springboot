package com.educandoweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop.entities.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
