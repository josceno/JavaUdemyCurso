package Javabase.Poo.Aula239.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Javabase.Poo.Aula239.entities.Product;
import Javabase.Poo.Aula239.services.CalculationServices;

public class Program {
    public static void main(String[] args) {
        List<String> items   = new ArrayList<>(Arrays.asList("Computer,890.0", "iphone X,910.0", "tablet, 550.0"));
        
        String path = "C:\\temp\\sumary.csv";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String lines : items) {
                bw.write(lines);
                bw.newLine();
            }
            
        }catch(IOException e){
            System.out.println(e.getMessage());

        }
        List<Product> products = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String[] product = br.readLine().split(",");
            while(product[0]!=null || product[1]!=null){   
                products.add(new Product(product[0], Double.parseDouble(product[1])));
                product = br.readLine().split(",");
                
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){

        }
        finally{
            
            for (Product p : products) {
                System.out.println(p);
            }
            System.out.println("Most expensive product: ");
            System.out.println(CalculationServices.max(products));
        }

    }
}
