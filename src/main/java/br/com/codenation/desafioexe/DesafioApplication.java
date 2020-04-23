package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List numerosFibonacci = new ArrayList();
		int limite = 350; // limitando qual será o maior numero da sequencia
		int soma = 0;
		int n1 = 0;
		int n2 = 1;

		numerosFibonacci.add(0);
		numerosFibonacci.add(1);

		for (int i = 0; soma < limite; i++) {
			soma = n1 + n2;
			numerosFibonacci.add(soma);
			n1 = n2;
			n2 = soma;
		}

		return numerosFibonacci;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}