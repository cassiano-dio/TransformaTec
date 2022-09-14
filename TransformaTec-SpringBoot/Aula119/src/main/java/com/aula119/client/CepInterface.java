package com.aula119.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Comunicação com a API do ViaCEP
@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface CepInterface {

    //Obter endereço por um cep informado
    @GetMapping("{cep}/json")
    Address getAddressByCep(@PathVariable("cep") String cep);

    //Obter endereços por descrição
    @GetMapping("{uf}/{cidade}/{logradouro}/json")
    List<Address> getAddressByDescription(
        @PathVariable("uf") String uf, 
        @PathVariable("cidade") String cidade, 
        @PathVariable("logradouro") String logradouro
    );
    
}
