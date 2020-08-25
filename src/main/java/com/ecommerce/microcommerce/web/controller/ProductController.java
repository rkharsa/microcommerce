package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductDao productDao;

    @GetMapping(value = "/Produits")
    public List<Product> listeProduits(){
        return productDao.findAll();
    }
    @PostMapping(value = "/Produits")
    public void save(@RequestBody Product product){
         productDao.save(product);
    }
    @GetMapping(value="/Produits/{id}")
    public Product findById(@PathVariable int id ){
        return productDao.findById(id);
    }
}
