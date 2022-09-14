package com.aula121.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aula121.project.models.Coin;

public interface CoinRepository extends JpaRepository<Coin, Long>{

    @Query("select c from Coin c where c.value >= :value")
    List<Coin> getCoinsHighValue(@Param("value") Double value);

    List<Coin> findByExchange(String exchange);
    
}
