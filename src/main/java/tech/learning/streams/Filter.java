package tech.learning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Carol", 10);
        Aluno a3 = new Aluno("Pabllo", 11);
        Aluno a4 = new Aluno("Urias", 6);
        Aluno a5 = new Aluno("Queixuda", 7);
        Aluno a6 = new Aluno("Catuxa", 3);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> logarMensagem = a -> "Parabéns " + a.nome + "! \nVocê foi aprovado com nota " + a.nota + "\n\n";

        alunos.stream()
                .filter(aprovado)
                .map(logarMensagem)
                .forEach(System.out::println);
    }
}
