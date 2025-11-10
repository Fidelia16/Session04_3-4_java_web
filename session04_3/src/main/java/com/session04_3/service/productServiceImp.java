package com.session04_3.service;

import com.session04_3.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class productServiceImp implements productService {
    private List<Product> products = Arrays.asList(
            new Product(1, "iPhone 15 Pro Max", 128,12, "Điện thoại Apple flagship 2024, màn hình 6.7 inch"),
            new Product(2, "Samsung Galaxy S24 Ultra", 113,95, "Smartphone Android cao cấp với bút S-Pen"),
            new Product(3, "MacBook Air M3", 45, 123,"Laptop siêu mỏng nhẹ, chip Apple M3 mạnh mẽ"),
            new Product(4, "Dell XPS 13", 38,421, "Laptop Windows cao cấp, thiết kế đẹp"),
            new Product(5, "Sony WH-1000XM5", 150,412, "Tai nghe chống ồn hàng đầu thế giới"),
            new Product(6, "iPad Pro 12.9 inch", 60,432, "Máy tính bảng chuyên nghiệp cho đồ họa"),
            new Product(7, "Apple Watch Ultra 2", 72, 421,"Đồng hồ thông minh cao cấp nhất của Apple"),
            new Product(8, "Nintendo Switch OLED", 85, 412,"Máy chơi game cầm tay màn hình OLED"),
            new Product(9, "GoPro Hero 12 Black", 120, 142,"Camera hành động quay 5.3K, chống nước"),
            new Product(10, "AirPods Pro Gen 2", 200, 14,"Tai nghe không dây với chống ồn chủ động")
    );

    public List<Product> getProducts(){
        return products;
    }

    @Override
    public List<Product> findProductsByName(String keyword) {
        return products.stream()
                .filter(p -> p.getProductName().toLowerCase()
                        .contains(keyword.toLowerCase()))
                .collect(Collectors.toList());

    }

}