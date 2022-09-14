package com.aula118.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassroomControler {

    private static Classroom classRoom = new Classroom(1,1);

    @GetMapping("/class")
    public ClassroomResponse getStudent(){

        return ClassroomResponse.builder().id(classRoom.getId()).number(classRoom.getNumber()).build();

    }
    
}
