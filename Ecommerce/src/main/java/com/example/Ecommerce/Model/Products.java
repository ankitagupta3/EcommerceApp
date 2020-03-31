package com.example.Ecommerce.Model;

import javax.persistence.*;

@Entity
@Table(name="PRODUCTS_TABLE" , schema="schema")
public class Products {

    @Id
    @GeneratedValue
    @Column(name="skuNumber")
    private int skuNumber;
    @Column(name="brandName")
   private String brandName;
    @Column(name="priceOfArticle")
   private int priceOfArticle;
    @Column(name="colorOfArticle")
   private String colorOfArticle;
    @Column(name="sizeOfArticle")
   private String sizeOfArticle;
    @Column(name="availableProductsFromSeller")
   private int availableProductsFromSeller;

    public Products() {
    }

    public Products(String brandName, int priceOfArticle, String colorOfArticle, String sizeOfArticle, int availableProductsFromSeller) {
        this.brandName = brandName;
        this.priceOfArticle = priceOfArticle;
        this.colorOfArticle = colorOfArticle;
        this.sizeOfArticle = sizeOfArticle;
        this.availableProductsFromSeller = availableProductsFromSeller;
    }

    public Products(int skuNumber, String brandName, int priceOfArticle, String colorOfArticle, String sizeOfArticle, int availableProductsFromSeller) {
        this.skuNumber = skuNumber;
        this.brandName = brandName;
        this.priceOfArticle = priceOfArticle;
        this.colorOfArticle = colorOfArticle;
        this.sizeOfArticle = sizeOfArticle;
        this.availableProductsFromSeller = availableProductsFromSeller;
    }

    public int getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(int skuNumber) {
        this.skuNumber = skuNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPriceOfArticle() {
        return priceOfArticle;
    }

    public void setPriceOfArticle(int priceOfArticle) {
        this.priceOfArticle = priceOfArticle;
    }

    public String getColorOfArticle() {
        return colorOfArticle;
    }

    public void setColorOfArticle(String colorOfArticle) {
        this.colorOfArticle = colorOfArticle;
    }



    public int getAvailableProductsFromSeller() {
        return availableProductsFromSeller;
    }

    public void setAvailableProductsFromSeller(int availableProductsFromSeller) {
        this.availableProductsFromSeller = availableProductsFromSeller;
    }
    public String getSizeOfArticle() {
        return sizeOfArticle;
    }

    public void setSizeOfArticle(String sizeOfArticle) {
        this.sizeOfArticle = sizeOfArticle;
    }
}
