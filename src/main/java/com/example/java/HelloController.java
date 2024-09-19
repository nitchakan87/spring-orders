package com.example.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.model.Order;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class HelloController {
    private   Logger log;

    @GetMapping("/orders")
    public List<Order> getOrders(@RequestHeader Map<String, String> RequestHeader) {

        log.info("request {}", RequestHeader);
        return Arrays.asList(
                new Order(1L, "book", 1234.00),
                new Order(2L, "cars", 1224.00),
                new Order(3L, "disk", 1244.00));
    }
}
 
