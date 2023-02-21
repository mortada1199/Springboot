package com.nctr.training.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "orders")
public class Order extends AbstractEntity {
    

    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private long userId;


    //??  fetch type
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
   
    @JoinColumn(name="users_id",insertable=false, updatable=false)
    private User user;

    private BigDecimal amount;


    private OrderStatus status;
}
