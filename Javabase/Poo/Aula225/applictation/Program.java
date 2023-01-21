package Javabase.Poo.Aula225.applictation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import Javabase.Poo.Aula225.models.entites.CarRental;
import Javabase.Poo.Aula225.models.entites.Vehicle;
import Javabase.Poo.Aula225.models.services.BrazilTaxService;
import Javabase.Poo.Aula225.models.services.RentalService;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Enter rental data: ");
        System.out.print("Enter model: ");
        String carModel = input.nextLine();
        System.out.print("Pickup (dd/MM/yyyy): ");
        LocalDateTime pickup = LocalDateTime.parse(input.nextLine(),dFormatter);
        System.out.print("Return (dd/MM/yyyy): ");  
        LocalDateTime returndate = LocalDateTime.parse(input.nextLine(),dFormatter);
        

        CarRental carRental = new CarRental(pickup, returndate, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        Double pricePerHour = input.nextDouble();
        System.out.print("Enter price per Day: ");
        Double pricePerDay  =input.nextDouble();
        
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental);
        System.out.println("Invoice: ");
        System.out.println("Basic payment: "+String.format("%.2f",carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: "+String.format("%.2f",+carRental.getInvoice().getTax()));
        System.out.println("Total payment: "+String.format("%.2f",+carRental.getInvoice().getTotalpayment()));
        
        input.close();
        
    }
}
