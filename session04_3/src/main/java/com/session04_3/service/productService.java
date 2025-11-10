package com.session04_3.service;

import com.session04_3.Model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
public interface productService {
    List<Product> getProducts();
    List<Product> findProductsByName(String keyword);
}
