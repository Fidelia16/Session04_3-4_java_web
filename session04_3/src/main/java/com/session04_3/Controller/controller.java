package com.session04_3.Controller;

import com.session04_3.Model.Product;
import com.session04_3.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/controller")
public class controller {
    @Autowired
    private productService service;
    @GetMapping("/greet")
    public String findAll(Model model){
        model.addAttribute("products", service.getProducts());
        return "findAll";
    }

    @GetMapping("/search")
    public String search(@RequestParam(required = false) String keyword, Model model) {
        List<Product> results = service.findProductsByName(keyword);
        model.addAttribute("products", results);
        model.addAttribute("keyword", keyword);
        return "search";
}}
