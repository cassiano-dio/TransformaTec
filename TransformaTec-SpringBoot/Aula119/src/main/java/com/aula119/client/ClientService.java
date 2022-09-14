package com.aula119.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientService {

    @Autowired
    private CepInterface cepInterface;

    @GetMapping("/api/{cep}")
    public ResponseEntity<Address> getByCep(@PathVariable String cep) {

        Address address = cepInterface.getAddressByCep(cep);

        return address != null ? ResponseEntity.ok().body(address)
                            : ResponseEntity.notFound().build();

    }

    @GetMapping("/api/{uf}/{cidade}/{logradouro}")
    public ResponseEntity<Object> getByDescription(
        @PathVariable String uf, @PathVariable String cidade, @PathVariable String logradouro
    ){
        List<Address> addresses = cepInterface.getAddressByDescription(uf, cidade, logradouro);

        return addresses != null ? ResponseEntity.ok().body( addresses ) : ResponseEntity.notFound().build();
    }
    
}
