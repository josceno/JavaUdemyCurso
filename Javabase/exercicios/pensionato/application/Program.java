package Javabase.exercicios.pensionato.application;

import java.util.Scanner;

import Javabase.exercicios.pensionato.models.Hospede;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int n = input.nextInt();
        Hospede[] rooms = new Hospede[10];
        for (int i = 0; i <n; i++) {
            System.out.println();
            System.out.println("Rent #"+(i+1)+": ");
            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int room = input.nextInt();

            rooms[room] = new Hospede(nome, email, room);   
        }

        System.out.println();
        System.err.println("Busy rooms: ");
        for (Hospede quartos : rooms) {
            if(quartos!=null){
                System.out.println(quartos);
            }
        }

        
        input.close();
    }
}
