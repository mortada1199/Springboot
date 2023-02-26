package com.nctr.training.controllers;

import java.sql.SQLException;

import org.apache.catalina.valves.rewrite.RewriteCond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nctr.training.models.Order;
import com.nctr.training.requests.CreateOrderRequest;
import com.nctr.training.responses.BasicResponse;
import com.nctr.training.services.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    
    @Autowired 
    private OrderService orderService;

    @RequestMapping(name = "/",method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<?> createOrder(@RequestBody @Valid CreateOrderRequest orderRequest) throws SQLException {
        System.out.println(orderRequest);
        Order order=orderService.create(orderRequest);

        return new ResponseEntity<>(new BasicResponse("success","000",order),HttpStatus.OK);
    }
}
