package application;

import java.util.ArrayList;
import java.util.List;

import Models.Homem;
import Models.Mulher;
import Models.Pessoa;

public class Main {
    public static void main(String[] args) {
       List<Homem> homems = new ArrayList<>();
       List<Mulher> mulheres = new ArrayList<>();

       
       homems.add(new Homem("Alberto",1.70));
       homems.add(new Homem("Carlos",1.80));
       
       

       mulheres.add(new Mulher("Carla", 1.60));
       mulheres.add(new Mulher("Alberta", 1.50));
      
      
       System.out.println(Util.maiorPessoa(homems));
       System.out.println(Util.maiorPessoa(mulheres));
       System.out.println(String.format("%.2f", Util.mediaAlturas(homems, mulheres)));
       
    }
}
