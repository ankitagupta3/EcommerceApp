package com.example.Ecommerce.Service;

import com.example.Ecommerce.Model.Products;

public interface ProductServiceInterface {

    public Iterable<Products> getAllProducts();
    public Products findOne(long sku);
}
