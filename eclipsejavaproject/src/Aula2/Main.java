package Aula2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Main principal = new Main();
		
		principal.InputTest();
	}
	public void InputTest() {
	System.out.println("insira numero para a divisão");
		Scanner input = new Scanner(System.in);
		Double x = input.nextDouble();
		Integer y = input.nextInt();
		System.out.printf("%.2f",(double) x/y);
	}
	public void CorredorPalavras() {
		Scanner input = new Scanner(System.in);
		String word = "word";
		for (int i = 0; i < word.length(); i++) {
			  char word0 = word.charAt(i);
			  char word1 = word.charAt(i);
			  String wordo = ""+(word0);
			  System.out.println(wordo);
		}
	}
}
