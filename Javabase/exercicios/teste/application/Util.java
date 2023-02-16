package application;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Models.Homem;
import Models.Mulher;
import Models.Pessoa;

public class Util {
    public static <T extends Pessoa> Pessoa maiorPessoa(List<T> pessoas){
        Pessoa maiorPessoa = pessoas.get(0);
        for (Pessoa pessoa : pessoas) {
            maiorPessoa = (maiorPessoa != null && maiorPessoa.getAltura()<pessoa.getAltura() ) ? pessoa:maiorPessoa;
        }
        return maiorPessoa;
    }
    public static<T extends Pessoa> Double mediaAlturas(List<Homem> pessoas1, List<Mulher> pessoas2){
        List<Pessoa> pessoas = Stream.concat(pessoas1.stream(), pessoas2.stream()).collect(Collectors.toList());
        Double sum = pessoas.stream().map(Pessoa::getAltura).reduce(0.0,Double::sum);
        return sum/pessoas.size();
    }
}
