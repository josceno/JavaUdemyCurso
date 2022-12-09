package Aula3;

import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		MathPratice(9,2);
	}
	public static void inputstr() {
		Scanner input = new Scanner(System.in);
		System.out.println("adcione nome e sobrenome");
		String nome = input.next();
		String sobrenome = input.next();
		System.out.println(nome + "\n"+sobrenome);
	}
	public static void MathPratice(double number1, double number2) {
		double Raiz = Math.sqrt(number1);
		int potencia = (int) Math.pow(number1, number2);
		System.out.println("A raiz de "+number1 +" é:"+Raiz+"\n a potencia de "+(int)number1+" elevado a "+(int)number2+"é: "+potencia);
	}
}
