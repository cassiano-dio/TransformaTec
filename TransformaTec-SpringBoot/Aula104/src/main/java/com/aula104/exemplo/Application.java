package com.aula104.exemplo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        WriterBean bean = context.getBean(WriterBean.class);

        bean.run();
        context.close();
    }
}
