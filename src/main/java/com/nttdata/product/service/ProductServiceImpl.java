package com.nttdata.product.service;

import com.nttdata.product.entity.Product;
import com.nttdata.product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    IProductRepository repository;

    @Override
    public Flux<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Product> getProductById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Product> save(Product product) {
        return repository.save(product);
    }

    @Override
    public Mono<Product> update(Product product) {
        return repository.save(product);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();
    }
}
