package br.com.assertiva.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.assertiva.consumer.engine.MensageConsumer;

@SpringBootApplication
public class ConsumerApplication   {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}


}
