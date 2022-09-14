package com.aula109.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_students")
public class Student {
    
    //Atribubutos do objeto mapeados como colunas da tabela
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id", columnDefinition = "INTEGER", nullable = false)
    private int id;

    @Column(name = "student_name", columnDefinition = "VARCHAR", nullable = false, length = 100)
    private String name;

    @Column(name = "student_status", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean status;

    // Definindo os métodos construtores
    public Student(){
        super();
    }

    @Override
    public String toString(){
        return String.format("ESTUDANTE:\nIdentificador: %d\nNome: %s\nStatus: %s", id, name, Boolean.toString(status));

    }

    //Getters e setters
    public Student(String name, Boolean status){
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getStatus() {
        return status;
    }
}
