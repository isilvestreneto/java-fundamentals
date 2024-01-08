package tech.learning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        /*
        1. 2 lambdas para filtros
        2. 1 map
         */
        Predicate<Serie> isAnime = serie -> serie.genero.equalsIgnoreCase("anime");
        Predicate<Serie> isProtagonistAWoman = serie -> serie.protagonistWoman;
        Function<Serie, String> result = serie -> "Anime: " + serie.nome + "\nProtagonista mulher? Sim\n\n";
        Serie s1 = new Serie("Sakura Card Captors", "Anime", true);
        Serie s2 = new Serie("Evangelion", "Anime", false);
        Serie s3 = new Serie("Avatar: A Lenda de Aang", "Animação", false);
        Serie s4 = new Serie("Naruto", "Anime", false);
        Serie s5 = new Serie("Death Note", "Anime", false);
        Serie s6 = new Serie("Sailor Moon", "Anime", true);
        List<Serie> series = Arrays.asList(s1, s2, s3, s4, s5, s6);

        series.stream()
                .filter(isAnime)
                .filter(isProtagonistAWoman)
                .map(result)
                .forEach(System.out::print);
    }
}
