package algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("00.00");

		double salBruto, salLiquido, inss, imposto;
		
		System.out.println("CALCULANDO O SALÁRIO");
		System.out.println();
		
		System.out.println("Informe o salário bruto: ");
		salBruto = entrada.nextDouble();
		
		inss = salBruto * 0.05;
		imposto = salBruto * 0.11;
		
		salLiquido = salBruto - (inss + imposto);
		
		System.out.println();
		System.out.println("O valor do inss é de: "+formatador.format(inss));
		System.out.println("O valor do imposto é de: "+formatador.format(imposto));
		System.out.println("O salário líquido é de: "+formatador.format(salLiquido));
		
		entrada.close();
	}

}
