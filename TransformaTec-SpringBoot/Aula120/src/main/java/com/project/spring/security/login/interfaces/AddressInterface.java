package com.project.spring.security.login.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.spring.security.login.payload.response.AddressResponse;

@FeignClient(url = "https://viacep.com.br/ws/", name = "cep")
public interface AddressInterface {
    
    @GetMapping("{cep}/json")
    AddressResponse getAddressByCep(@PathVariable("cep") String cep);

    @GetMapping("{uf}/{cidade}/{logradouro}/json")
    List<AddressResponse> getAddressByDescription(
        @PathVariable("uf") String uf,
        @PathVariable("cidade") String cidade,
        @PathVariable("logradouro") String logradouro
    );

}
