package com.example.saleserivce.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sale-service/sale")
@RequiredArgsConstructor
public class SaleController {
    @GetMapping("/get")
    public String helloWord() {
        return "sale service....";
    }

}
