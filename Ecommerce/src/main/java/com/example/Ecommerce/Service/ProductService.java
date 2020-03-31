package com.example.Ecommerce.Service;

import com.example.Ecommerce.Model.Products;
import com.example.Ecommerce.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductsRepository productRepository;

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

   public Optional<Products> findOne(int sku) {
        return productRepository.findById(sku);
    }

    /* public List<Products> groupSameBrandProducts(String brand){

    }*/

}
