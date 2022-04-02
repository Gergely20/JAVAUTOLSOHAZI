package com.example.ElolenyesHazi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class ElolenyesHaziApplication {

	public static void main(String[] args) {
		Eloleny kutya = new Eloleny("kutya");
		kutya.meghal();
	}

}
