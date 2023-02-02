package Javabase.Poo.Aula259.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javax.xml.stream.util.StreamReaderDelegate;

public class Program {
    public static void main(String[] args){
        List<Integer> listInt = Arrays.asList(3,4,5,10,7);

        Stream<Integer> streamInt = listInt.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(streamInt.toArray()));

        Stream<String> streamStr = Stream.of("João","Afonso","Pedro");

        System.out.println(Arrays.toString(streamStr.toArray()));

        Stream<Integer> streamInt2 = Stream.iterate(1, x -> x*2);

        System.out.println(Arrays.toString(streamInt2.limit(10).toArray()));
        
        Stream<Long> streamLong = Stream.iterate(new Long[] {0L,1L}, p -> new Long[] {p[1],p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(streamLong.limit(10).toArray()));

    }
}
