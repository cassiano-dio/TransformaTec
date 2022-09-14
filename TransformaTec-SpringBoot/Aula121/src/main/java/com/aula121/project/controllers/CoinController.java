package com.aula121.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aula121.project.models.Coin;
import com.aula121.project.repositories.CoinRepository;

@RestController
@RequestMapping("/api")
public class CoinController {
    
    @Autowired
    private CoinRepository coinRepository;

    @PostMapping("/coin")
    public ResponseEntity<Coin> insertCoin(@RequestBody Coin coin){
        
        coinRepository.save(coin);

        return new ResponseEntity<Coin>(coin,  HttpStatus.CREATED);
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Coin>> listCoins(){
        
        return new ResponseEntity<List<Coin>>(coinRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/exchanges/{exchange}")
    public ResponseEntity<List<Coin>> listCoinsByExchange(@PathVariable("exchange") String exchange){

        return new ResponseEntity<List<Coin>>(coinRepository.findByExchange(exchange), HttpStatus.OK);
    }

    @GetMapping(value = "/top")
    public ResponseEntity<List<Coin>> listTopCoins(@RequestParam("value") Double value){
        
        return new ResponseEntity<List<Coin>>(coinRepository.getCoinsHighValue(value), HttpStatus.OK);
    }

}
