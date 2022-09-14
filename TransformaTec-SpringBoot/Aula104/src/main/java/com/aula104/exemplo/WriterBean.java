package com.aula104.exemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WriterBean {
    
    private IWriter writer;

    //Injeção de dependências
    @Autowired
    public void setWriter(IWriter writer){
        this.writer = writer;
    }

    public void run(){
        String s = "Debi e Lóide";
        writer.write(s);
    }

}