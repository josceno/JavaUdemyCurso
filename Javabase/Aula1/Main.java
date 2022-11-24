package Javabase.Aula1;

import java.util.Locale;

public class Main {
	
	public void calculos(int a, int b) {
		System.out.print(a+b);
	}


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		CalculosPlus calculo = new CalculosPlus(3,3); 
		System.out.println("hello world");
		calculo.soma();
		calculo.Resto();	
		
	}	
}
class Calculos{
	private int a;
    private int b;
    
	Calculos(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int getA(){
		return this.a;
	}
	
	public int getB() {
		return this.b;	
	}
	public void soma() {
		System.out.println(this.a+ this.b);
	}
	public void multiplicacao() {
		System.out.println(this.a * this.b);
	}
	public void divisao() {
		System.out.println(this.a/ this.b);
	}
	public void subtracao() {
		System.out.println(this.a - this.b);
	}
}
class CalculosPlus extends Calculos{

	CalculosPlus(int a, int b) {
		super(a, b);
		
		// TODO Auto-generated constructor stub
	}
	public void Resto() {
		double A = this.getA();
		double B = this.getB();
		System.out.printf("%.2f%n",A%B);
	}
	
}
