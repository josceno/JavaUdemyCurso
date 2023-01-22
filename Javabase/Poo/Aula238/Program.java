package Javabase.Poo.Aula238;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many values: ");
        int indexs = input.nextInt();

        PrintService<Object> lista = new PrintService<>();
        for (int i = 0; i < indexs; i++) {
            lista.addValue(input.nextInt());
        }
        lista.print();
        System.out.println("First: "+lista.first());
        input.close();
        
    }
}
