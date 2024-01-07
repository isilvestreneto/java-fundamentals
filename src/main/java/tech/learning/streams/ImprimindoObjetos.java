package tech.learning.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Juliano", "Carlos", "Patrícia");

        System.out.println("\nUsando foreach:");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\nUsando Iterator:");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando Stream:");
        /*
        Iteração ocorre de forma interna
        Nao sendo necessário código explícito para iterar
        */
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
