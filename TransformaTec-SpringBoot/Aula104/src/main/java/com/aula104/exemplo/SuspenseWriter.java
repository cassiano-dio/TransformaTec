package com.aula104.exemplo;

import org.springframework.stereotype.Service;


public class SuspenseWriter implements IWriter{

    @Override
    public void write(String s) {
        
        System.out.println("História de suspense: " + s);
        
    }
    
}
