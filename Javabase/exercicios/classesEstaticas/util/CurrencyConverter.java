package Javabase.exercicios.classesEstaticas.util;

public class CurrencyConverter {
    public static double convertedValue(double currency, double bought){
        
        return currency * bought + ((currency*bought)*0.06);
    }
}
