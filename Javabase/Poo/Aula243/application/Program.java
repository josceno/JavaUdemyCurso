package Javabase.Poo.Aula243.application;

import java.util.HashSet;
import java.util.Set;

import javax.security.auth.x500.X500Principal;

public class Program {
    
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("tv");
        set.add("Notebokk");
        set.add("Tablet");

        set.removeIf(x -> x.charAt(0)=='t');

        for (String string : set) {
            System.out.println(string);
        }
    }
    
}
