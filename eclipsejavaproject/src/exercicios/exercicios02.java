package exercicios;

import java.util.Scanner;

public class exercicios02 {
	public static int SOMA() {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira os numeros que serão usados");
		System.out.print("1° numero: ");
		int num1 = input.nextInt();
		System.out.print("2° numero: ");
		int num2 =input.nextInt();
		
		return num1 + num2;			
		
	}
	public static void verificarNegativo(){
		Scanner input = new Scanner(System.in);
		System.out.print("insira o numero");
		int num = input.nextInt();
		if(num > 0){
			System.out.printf(" %d é maior que zero",num);
		}
		if(num<0){
			System.out.printf("%d é menor que 0",num);
		}
		if(num == 0){
			System.out.println("numero igual 0");
		}
	}
	public static void verificarparidade(){
		System.out.println("Verificar paridade");
		Scanner input = new Scanner(System.in);
		System.out.println("insira um numero");
		int num = input.nextInt();
		if (num%2 == 0){
			System.out.printf("%d é par",num);
		}
		else{
			System.out.printf("%d é impar",num);
		}
	}
	public static int contadorHoras(int inicio, int fim){
		int horas = 0;
		if (inicio < 12 && fim >0){
			horas = inicio - fim;
		} 
		return Math.abs(horas);
	} 
	public static void main(String[] args) {
		//System.out.printf("SOMA = " + SOMA());
		//verificarNegativo();
		//verificarparidade();
		System.out.println(contadorHoras(2, 16) + " horas");
	}
}
