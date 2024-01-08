package tech.learning.streams;

public class Aluno {
    final String nome;
    final double nota;

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}
