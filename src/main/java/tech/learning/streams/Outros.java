package tech.learning.streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas", 3);
        Aluno a2 = new Aluno("Pedro", 10);
        Aluno a3 = new Aluno("Lorena", 7);
        Aluno a4 = new Aluno("Carmen", 5);
        Aluno a5 = new Aluno("Lucas", 3);
        Aluno a6 = new Aluno("Pedro", 10);
        Aluno a7 = new Aluno("Lorena", 7);
        Aluno a8 = new Aluno("Carmen", 5);
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        // Distinct
        alunos.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println();

        // Skip/Limit
        alunos.stream()
                .distinct()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        System.out.println();

        // TakeWhile
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }
}
