package teste;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		int operacao,num[]=new int[2],resultado;
		
		System.out.println("Insira o primeiro numero: ");
		Scanner in1= new Scanner(System.in);
		num[0]=in1.nextInt();
		
		System.out.println("Insira o segundo numero: ");
		Scanner in2= new Scanner(System.in);
		num[1]=in2.nextInt();
		
		System.out.println("Insira a operacao: ");
		System.out.println("1- Soma.");
		System.out.println("2- Subtracao.");
		System.out.println("3- Multiplicacao.");
		System.out.println("4- Divisao.");
		System.out.println("5- Resto da divisao.");
		Scanner in=new Scanner(System.in);
		operacao=in.nextInt();
		
		if (operacao == 1) {
			resultado=num[0]+num[1];
			System.out.println("Resultado: "+resultado);
		}
		if (operacao == 2) {
			resultado=num[0]-num[1];
			System.out.println("Resultado: "+resultado);
		}
		if (operacao == 3) {
			resultado=num[0]*num[1];
			System.out.println("Resultado: "+resultado);
		}
		if (operacao == 4) {
			resultado=num[0]/num[1];
			System.out.println("Resultado: "+resultado);
		}
		if (operacao == 5) {
			resultado=num[0]%num[1];
			System.out.println("Resultado: "+resultado);
		}
	}
}
