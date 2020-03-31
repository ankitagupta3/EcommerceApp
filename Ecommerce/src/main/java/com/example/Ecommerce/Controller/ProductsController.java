package com.example.Ecommerce.Controller;

import com.example.Ecommerce.Model.Products;
import com.example.Ecommerce.Service.ProductService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = { "/allProducts" })
    public List<Products> getProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/allProducts/{sku}")
    public Optional<Products> showOne(@PathVariable("sku") int sku) {
        return productService.findOne(sku);

    }
   /* @GetMapping("/allProducts/{brand}")
    public List<Products> groupByBrand(@PathVariable("brand") String brand){
        return productService.groupSameBrandProducts(brand);
    }*/
}
