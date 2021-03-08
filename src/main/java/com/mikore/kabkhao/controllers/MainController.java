package com.mikore.kabkhao.controllers;

import com.mikore.kabkhao.entities.Order;
import com.mikore.kabkhao.services.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
public class MainController
{
    private final OrderRepository repository;

    public MainController(OrderRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public Iterable<Order> all() {
        return repository.findAll();
    }
}
