package tech.learning.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio2Filter {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto 1", 50.0f, 0.1f, false));
        produtos.add(new Produto("Produto 2", 30.0f, 0.05f, true));
        produtos.add(new Produto("Produto 3", 70.0f, 0.2f, false));
        produtos.add(new Produto("Produto 4", 25.0f, 0.0f, true));
        produtos.add(new Produto("Produto 5", 60.0f, 0.15f, false));
        produtos.add(new Produto("Produto 6", 40.0f, 0.0f, true));
        produtos.add(new Produto("Produto 7", 80.0f, 0.25f, false));
        produtos.add(new Produto("Produto 8", 35.0f, 0.0f, true));
        produtos.add(new Produto("Produto 9", 55.0f, 0.2f, false));
        produtos.add(new Produto("Produto 10", 45.0f, 0.0f, true));

        Predicate<Produto> hasOffer = produto -> produto.desconto > 0.0f;
        Predicate<Produto> isFreteGratis = produto -> produto.isFreteGratis;
        Function<Produto, String> message = produto -> "O produto " + produto.nome + " está com desconto e frete grátis, aproveite! :D";

        produtos.stream()
                .filter(hasOffer)
                .filter(isFreteGratis)
                .map(message)
                .forEach(System.out::println);

    }
}
