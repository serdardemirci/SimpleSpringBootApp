package com.serdardemirci.simplespringbootapp.controllers;

import com.serdardemirci.simplespringbootapp.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    List<Product> getUsersProduct(long userId) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Test"));
products.stream().map(a -> a).collect(Collectors.toList());
        return products;
    }
}
