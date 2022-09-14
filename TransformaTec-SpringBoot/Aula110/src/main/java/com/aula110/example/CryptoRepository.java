package com.aula110.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CryptoRepository extends JpaRepository<Crypto, Long>{
    
    @Query("select c from Crypto c where c.rate > 1500")
    List<Crypto> getAllHigh();

    List<Crypto> findByExchange(String exchange);

}
