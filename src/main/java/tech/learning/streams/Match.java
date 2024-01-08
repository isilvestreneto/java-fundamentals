package tech.learning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas", 3);
        Aluno a2 = new Aluno("Pedro", 10);
        Aluno a3 = new Aluno("Lorena", 10);
        Aluno a4 = new Aluno("Carmen", 7);
        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        // todos dão match
        System.out.println(alunos.stream().allMatch(aprovado));

        // algum match?
        System.out.println(alunos.stream().anyMatch(aprovado));

        // 0 matches?
        System.out.println(alunos.stream().noneMatch(aprovado));
    }
}
