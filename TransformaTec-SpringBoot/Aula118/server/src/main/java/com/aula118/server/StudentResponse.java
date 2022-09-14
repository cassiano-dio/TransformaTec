package com.aula118.server;

import lombok.Builder;
import lombok.Data; 

@Data
@Builder
public class StudentResponse {

    private Integer id;
    private String name;
    private Integer age;

}
