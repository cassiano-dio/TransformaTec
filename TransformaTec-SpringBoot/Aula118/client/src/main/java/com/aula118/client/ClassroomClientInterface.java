package com.aula118.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "class", url = "http://localhost:8081/class")
public interface ClassroomClientInterface {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    ClassroomClientResponse getClassroom();
    
}
