package com.nttdata.product.controller;

import com.nttdata.product.entity.Product;
import com.nttdata.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService service;

    @GetMapping
    public Flux<Product> getProducts(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Mono<Product> getProductById(@PathVariable("id") String id){
        return service.getProductById(id);
    }

    @PostMapping
    Mono<Product> postProduct(@RequestBody Product product){
        return service.save(product);
    }

    @PutMapping
    Mono<Product> updProduct(@RequestBody Product product){
        return service.update(product);
    }

    @DeleteMapping("/{id}")
    void dltProduct(@PathVariable("id") String id){
        service.delete(id);
    }

}
