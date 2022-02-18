package com.nttdata.product.service;

import com.nttdata.product.entity.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductService {

    Flux<Product> getAll();

    Mono<Product> getProductById(String id);

    Mono<Product> save(Product product);

    Mono<Product> update(Product product);

    void delete(String id);
}
