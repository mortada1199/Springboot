package com.nctr.training.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.nctr.training.models.Item;

@Repository
@EnableJpaRepositories
public interface ItemRepository extends JpaRepository<Item,Long>{
    
}
