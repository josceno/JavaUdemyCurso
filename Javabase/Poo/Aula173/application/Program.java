package Javabase.Poo.Aula173.application;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Javabase.Poo.Aula173.entities.Reservation;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sp = new  SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Room number: ");
        int roomNumber = input.nextInt(); 
        System.out.print("Check -in - (dd/MM/yyyy):  ");
        Date checkin = sp.parse(input.next());
        Reservation reservation = new Reservation();
        System.out.print(reservation);

    }
}
