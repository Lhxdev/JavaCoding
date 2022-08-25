package ReservaPoltronas;

import java.util.Scanner; //ERRO NA PORRA TODA

class Poltronas{
	 public static int[][] poltrona = new int [10][10];
	 private String nome_Reserva;
	 private int id_Poltrona;
	 public static int ocupado;
	}
public class ReservaPoltronas {
	public static void main(String[] args) {
		Scanner in1= new Scanner(System.in);
		System.out.println("Bem vindo ao sistema de reserva de poltronas do cinema X!\r\nCarregando menu...");
		menu();
		iniciarSessao();
		
		in1.close();
	}
	public static void iniciarSessao() {
		int [][] p = new int [10][10];
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				//Poltronas.ocupado[i][j]=0;
			}
		}
	}
	public static void menu(){
		Scanner in1= new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("Menu de opcoes:\r\n1- Reservar\r\n2- Comprar\r\n3- Cancelar\r\n4- Sair ");
		System.out.println("--------------------------------------");
		System.out.print("Insira a opcao desejada: ");
		int opcao = in1.nextInt();
			switch (opcao) {
			case 1:
				reservarPoltrona();
				break;
			case 2:
				comprarPoltrona();
				break;
			case 3:
				cancelar();
				break;
			case 4:
				sair();
				break;
			default:
				System.out.println("Opcao invalida!");
			}
			
		in1.close();
	}
	public static void reservarPoltrona(){
		Scanner in1= new Scanner(System.in);
		System.out.println("Opcao escolhida: Reservar poltrona.\r\nPoltronas disponiveis: ");
		in1.close();
	}
	public static void comprarPoltrona(){
		Scanner in1= new Scanner(System.in);
		
	}
	public static void cancelar(){
		Scanner in1= new Scanner(System.in);
		
	}
	public static void sair(){
		Scanner in1= new Scanner(System.in);
		
	}
}
