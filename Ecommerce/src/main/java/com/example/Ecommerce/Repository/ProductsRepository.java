package com.example.Ecommerce.Repository;

import com.example.Ecommerce.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("productRepository")
public interface ProductsRepository extends JpaRepository<Products,Integer> {

}
