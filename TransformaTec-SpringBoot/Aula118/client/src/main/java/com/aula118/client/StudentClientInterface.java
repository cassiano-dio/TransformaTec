package com.aula118.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "student", url = "http://localhost:8080/student")
public interface StudentClientInterface {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    StudentClientResponse getStudent();
    
}
