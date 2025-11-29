package org.fst.productmicroservice.repositories;

import org.fst.productmicroservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
