package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SearchCounterService {
	
	int contador = 0;
	
	public void increment() {
		contador ++;
        System.out.println("Contador atualizado -> " + contador);
	}
	
	public int getContador() {
		return contador;
	}

}
