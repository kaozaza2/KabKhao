package com.mikore.kabkhao.services;

import com.mikore.kabkhao.entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>
{
    // 
}
