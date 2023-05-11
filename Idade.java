package algoritmos;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		int anoNascimento, anoAtual, idade;
		
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = entrada.nextInt();
		System.out.println("Digite o ano atual: ");
		anoAtual = entrada.nextInt();
		
		idade = anoAtual - anoNascimento;
		
		System.out.println("Você tem "+idade+" anos.");
		
	}

}
