package com.example.exammodul4.responsitory;

import com.example.exammodul4.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
