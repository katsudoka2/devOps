package com.ecommerce.microcommerce.web.controller;
import com.ecommerce.microcommerce.dao.*;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

        @RequestMapping(value="/products", method= RequestMethod.GET)
        public List<Product> listeProduits() {
            return productDao.findAll();
        }

    @GetMapping(value = "/products/{id}")
    public Product afficherUnProduit(@PathVariable int id) {

        return productDao.findById(id);


    }

    //ajouter un produit
    @PostMapping(value = "/products")
    public Product ajouterProduit(@RequestBody Product product) {
       return productDao.save(product);
    }


}

