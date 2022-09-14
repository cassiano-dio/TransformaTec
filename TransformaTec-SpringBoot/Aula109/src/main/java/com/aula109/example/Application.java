package com.aula109.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Mapeamento de classe para tabela
		repo.save(new Student("Marcos",true));
		repo.save(new Student("Joao",false));
		repo.save(new Student("Paulo",true));
		repo.save(new Student("Lucas",false));
		repo.save(new Student("Joao",false));

		System.out.println("\n-->Lista de alunos:\n");

		//Mapemento de tabela para classe
		for (Student student : repo.findAll()) {
			System.out.println("\n-->Dados do aluno:\n");
			System.out.println(student.toString());
		}

		System.out.println("\n-->Lista de alunos com status 'TRUE':\n");

		for (Student student : repo.findByStatus(true)) {
			System.out.println("\n-->Dados do aluno:\n");
			System.out.println(student.toString());
		}

		System.out.println("\n-->Lista de alunos com nome 'Joao':\n");

		for (Student student : repo.findByName("Joao")) {
			System.out.println("\n-->Dados do aluno:\n");
			System.out.println(student.toString());
		}

		System.out.println("\n-->Aluno com Id 2:\n");

		//Mapemento de tabela para classe
		Student student = repo.findById(2);
		System.out.println("\n-->Dados do aluno:\n");
		System.out.println(student.toString());
		

		
	}

}
