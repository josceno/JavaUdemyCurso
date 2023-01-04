package Javabase.Poo.Aula110;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Datetest {
    public static void main(String[] args ){
       dataCauculos();
    } 
    public static void dataCauculos(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.now();
        LocalDate pastWeek = date.minusWeeks(1);
        System.out.println(date.format(formatter));
        System.out.println(pastWeek.format(formatter));


    }

    public static void datahora(){
        DateTimeFormatter dDormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dDormat2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter dDormat3 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
        
        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();
        LocalDate d4 = LocalDate.parse("2022-03-01");
        LocalDateTime d5 = LocalDateTime.parse("2022-03-01T21:00:04");
        Instant d6 = Instant.parse("2022-03-01T21:00:04z");
        Instant d7 = Instant.parse("2022-03-01T21:00:04-03:00");

        LocalDate d8 = LocalDate.parse("04/01/2023",dDormat);
        LocalDateTime d9 = LocalDateTime.parse("04/01/2023 03:20",dDormat2);
        LocalDate d10 = LocalDate.of(2022, 3, 2);

        System.out.println(d1.format(dDormat));
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(dDormat3.format(d6));
        System.out.println(d8);
        System.out.println(d9);
        System.out.println(d10);

    }
}
