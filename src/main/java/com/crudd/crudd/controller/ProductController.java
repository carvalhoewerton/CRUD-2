package com.crudd.crudd.controller;

import com.crudd.crudd.model.Product;
import com.crudd.crudd.repository.ProductRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    @ApiOperation(value = "Retorna uma lista de produtos")
    public List<Product> productList(){
        return productRepository.findAll();
    }

    @GetMapping("/product/id")
    @ApiOperation(value = "Retorna um produto pelo seu ID")
    public Product uniqueProductById(@PathVariable(value ="id") long id){
        return productRepository.findById(id);
    }

    @PostMapping("/product")
    @ApiOperation(value = "Cria um novo produto")
    public Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping
    @ApiOperation(value = "Deleta um produto pela id")
    public void deleteProductById(@PathVariable(value = "id") long id){
        productRepository.deleteById(id);
    }



}
