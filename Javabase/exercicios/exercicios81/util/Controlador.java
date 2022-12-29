package Javabase.exercicios.exercicios81.util;
import java.util.Scanner;

import Javabase.exercicios.exercicios81.models.Conta;

public class Controlador {
    public static void gerenciadorBanco(Conta usuario){
        Scanner input = new Scanner(System.in);
        String choice;
        do{
            System.out.print("\ninsira 1 para depositar e 2 para sacar 0 para fechar");
            choice = input.next();
            switch(choice){
                case "1":
                    usuario.depositar();
                    break;
                case "2":
                    usuario.sacar();;
                    break;    
            }
        }while(!choice.equals("0"));
       
        

    }
}
