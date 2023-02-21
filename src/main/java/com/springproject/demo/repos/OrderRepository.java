package com.springproject.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.springproject.demo.models.Order;

@Repository
@EnableJpaRepositories
public interface OrderRepository extends JpaRepository<Order,Long> {
    
}
