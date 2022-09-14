package com.aula118.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("class")
public class ClassroomClientController {

    @Autowired
    ClassroomClientInterface classroomInterface;

    @GetMapping
    public ClassroomClientResponse getClassroomResponse(){
        return classroomInterface.getClassroom();
    }
    
}
