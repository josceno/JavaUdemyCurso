package Javabase.Poo.Aula173.util;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Javabase.Poo.Aula173.entities.Reservation;
import Javabase.Poo.Aula173.entities.exeptions.DomainException;


public class Solution {
   
    public static void goodSolution(){
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sp = new  SimpleDateFormat("dd/MM/yyyy");
        try{
            System.out.print("Room number: ");
            int roomNumber = input.nextInt(); 
            System.out.print("Check -in - (dd/MM/yyyy):  ");
            Date checkin = sp.parse(input.next());
            System.out.print("Check -in - (dd/MM/yyyy):  ");
            Date checkout = sp.parse(input.next());
            

            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println(reservation);
            
            System.out.println("Enter a date to update ");
            System.out.print("Room number: ");
            roomNumber = input.nextInt(); 
            System.out.print("Check -in - (dd/MM/yyyy):  ");
            checkin = sp.parse(input.next());
            System.out.print("Check -in - (dd/MM/yyyy):  ");
            checkout = sp.parse(input.next());

            reservation.updateCheckin(checkin, checkout);    
            System.out.println(reservation);
        } catch(ParseException e){
            System.out.println("invalid date format");
        } catch(DomainException e){
            System.out.println(" Error in reservesion: "+ e.getMessage());
        } 
        catch(Exception e){
            System.out.println("Unexpected error");
        }
    
        input.close();
    }
    

}