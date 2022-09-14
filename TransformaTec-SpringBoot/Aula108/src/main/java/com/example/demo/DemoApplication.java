package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(CryptoRepository repo){

		return (arg) -> {

			repo.save(new Crypto("Bitcoin","BTC"));
			repo.save(new Crypto("Ethereum","ETH"));
			repo.save(new Crypto("Ethereum Classic","ETC"));
			repo.save(new Crypto("Litecoin","LTC"));
			repo.save(new Crypto("Monero","XMR"));

			System.out.println("---------------------");
			System.out.println("Lista de criptomoedas");
			System.out.println("---------------------");
			
			for (Crypto crypto : repo.findAll()) {
				System.out.println(crypto.toString());
			}

			System.out.println();

			Crypto crypto = repo.findById(2);
			System.out.println("---------------------");
			System.out.println("Criptomoeda encontrada com ID 2");
			System.out.println("---------------------");
			System.out.println(crypto.toString());

			System.out.println();

			Crypto bitcoin = repo.findByName("Bitcoin");
			System.out.println("---------------------");
			System.out.println("Criptomoeda encontrada com o nome 'Bitcoin'");
			System.out.println("---------------------");
			System.out.println(bitcoin.toString());

			System.out.println();

			Crypto ethereum = repo.findBySymbol("ETH");
			System.out.println("---------------------");
			System.out.println("Criptomoeda encontrada com o símbolo 'ETH'");
			System.out.println("---------------------");
			System.out.println(ethereum.toString());

		};
	}

}
