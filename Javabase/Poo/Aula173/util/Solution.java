package Javabase.Poo.Aula173.util;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Javabase.Poo.Aula173.entities.Reservation;


public class Solution {
    public static void veryBadSolution() throws ParseException{
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sp = new  SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Room number: ");
        int roomNumber = 8021;/*input.nextInt();*/ 
        System.out.print("Check -in - (dd/MM/yyyy):  ");
        Date checkin = sp.parse("20/09/2029"/*input.next()*/);
        System.out.print("Check -in - (dd/MM/yyyy):  ");
        Date checkout = sp.parse("30/09/2029"/*input.next()*/);
        
      
        if(!checkout.after(checkin)){
            System.out.println("Enter a checkout date that is after the chekin date");
        }else{
            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println(reservation);
            
            System.out.println("Enter a date to update ");
            System.out.print("Room number: ");
            roomNumber = 8021;/*input.nextInt();*/ 
            System.out.print("Check -in - (dd/MM/yyyy):  ");
            checkin = sp.parse("05/10/2029"/*input.next()*/);
            System.out.print("Check -in - (dd/MM/yyyy):  ");
            checkout = sp.parse("06/10/2029"/*input.next()*/);

            //reservation.updateCheckin(checkin, checkout);
            System.out.println(reservation);

            Date now = new Date();

            if(checkin.before(now)|| checkout.before(now)){
                System.out.println(" dates must be o future");
            }else if(!checkout.after(checkin)){
                System.out.println("Enter a checkout date that is after the chekin date");
            }else {
                //reservation.updateCheckin(checkin, checkout);
                System.out.println(reservation);
            }}
            
        }
        public static void BadSolution() throws ParseException{
            Scanner input = new Scanner(System.in);
            SimpleDateFormat sp = new  SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Room number: ");
            int roomNumber = 8021;/*input.nextInt();*/ 
            System.out.print("Check -in - (dd/MM/yyyy):  ");
            Date checkin = sp.parse("23/09/2023"/*input.next()*/);
            System.out.print("Check -in - (dd/MM/yyyy):  ");
            Date checkout = sp.parse("26/09/2023"/*input.next()*/);
            
          
            if(!checkout.after(checkin)){
                System.out.println("Enter a checkout date that is after the chekin date");
            }else{
                Reservation reservation = new Reservation(roomNumber, checkin, checkout);
                System.out.println(reservation);
                
                System.out.println("Enter a date to update ");
                System.out.print("Room number: ");
                roomNumber = 8021;/*input.nextInt();*/ 
                System.out.print("Check -in - (dd/MM/yyyy):  ");
                checkin = sp.parse("24/09/2023"/*input.next()*/);
                System.out.print("Check -in - (dd/MM/yyyy):  ");
                checkout = sp.parse("29/09/2023"/*input.next()*/);
    
                String error =   reservation.kindaBadSolution(checkin, checkout);
                if(error != null){
                    System.out.println("Error in reservation "+ error);
                    System.out.println(reservation);
                }
                System.out.println(reservation);
                String a ="a";
            }
            input.close();

    }
    

}