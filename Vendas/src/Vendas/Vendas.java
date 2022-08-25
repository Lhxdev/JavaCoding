package Vendas;

import java.util.Scanner;

public class Vendas {
	static int[] estoque = new int[9];
	public static void main(String[] args) {
		iniciarEstoque();
		Funcionario();
		//for(int i=0;i<9;i++) {
		//	System.out.println("["+estoque[i]+"]");}
	}
	

	public static void Funcionario() {
		Scanner in1 = new Scanner(System.in);

		System.out.println("Bem vindo ao sistema da loja X!");
		System.out.print("Insira o seu id: ");
		int idFuncionario = in1.nextInt();
		
		if (idFuncionario == 1) {
			vendedor();
		}
		if (idFuncionario == 2) {
			//estoque=respEstoque();
		}
		in1.close();
	}

	public static void vendedor() {
		Scanner in1 = new Scanner(System.in);
		System.out.print("Insira o seu nome completo: ");
		String nomeVendedor = in1.nextLine();
		System.out.println("Ola vendedor "+ nomeVendedor+"!");
		inicioVendas(estoque);
		
		in1.close();
	}
	


	public static int idProdutos(int id) {
		switch (id) {
		case 0:
			menuProdutos();
		case 1:
			System.out.println("Produto selecionado: Mouse");
			break;
		case 2:
			System.out.println("Produto selecionado: Teclado");
			break;
		case 3:
			System.out.println("Produto selecionado: Processador");
			break;
		case 4:
			System.out.println("Produto selecionado: Placa de video");
			break;
		case 5:
			System.out.println("Produto selecionado: Placa mae");
			break;
		case 6:
			System.out.println("Produto selecionado: Memoria RAM");
			break;
		case 7:
			System.out.println("Produto selecionado: SSD");
			break;
		case 8:
			System.out.println("Produto selecionado: HD");
			break;
		case 9:
			System.out.println("Produto selecionado: Fone de ouvido");
			break;
		default:
			System.out.println("Codigo invalido!");
		}
		return id;
	}
	
	public static int menuProdutos() {
		Scanner in1 = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("Codigo dos produtos para venda: ");
		System.out.println("1- Mouse.");
		System.out.println("2- Teclado.");
		System.out.println("3- Processador.");
		System.out.println("4- Placa de video.");
		System.out.println("5- Placa mae.");
		System.out.println("6- Memoria RAM.");
		System.out.println("7- SSD.");
		System.out.println("8- HD.");
		System.out.println("9- Fone de ouvido");
		System.out.println("--------------------------------------");
		System.out.println("Insira o codigo do produto a ser vendido: ");
		int ids = in1.nextInt();
		in1.close();
		return ids;
	}
	
	public static int[] respEstoque() {
		Scanner in1 = new Scanner(System.in);
		System.out.println("Ola responsavel pelo estoque!");
		int[] estoque = new int[9];
		for (int i = 0; i < 9; i++) {
			System.out.print("Insira o estoque disponivel do produto "+(i+1)+ ": ");
			estoque[i] = in1.nextInt();
		}
		in1.close();
		return estoque;
	}
	public static int[] iniciarEstoque() {
		for (int i = 0; i < 9; i++) {
			estoque[i]=100;
		}
		return estoque;
	}

	public static void inicioVendas(int i[]) {
		
		Scanner in1 = new Scanner(System.in);
		System.out.println("Insira o codigo do produto a ser vendido: ");
		System.out.print("Caso nao saiba o codigo do produto digite 0: ");
		int idProduto = in1.nextInt();
		int id=idProdutos(idProduto);
		System.out.print("Insira a quantidade que sera vendida: ");
		int quantidade = in1.nextInt();
		if (estoque[id] == 0 || estoque[id] - quantidade <= 0) {
			System.out.println("Estoque insuficiente para venda.");
		}
		else {
			estoque[id] = estoque[id] - quantidade;		
		}
		System.out.print("Existem mais itens a serem vendidos?");
		String resposta = in1.nextLine();
		if (resposta.toLowerCase() == "sim") { // ERRO AQUI POR ENQUANTO (NAO ACEITA RESPOSTA)
			inicioVendas(i);			
		}
		in1.close();
	}
}
	

	
