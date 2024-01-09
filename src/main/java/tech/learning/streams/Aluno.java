package tech.learning.streams;

import java.util.Objects;

public class Aluno {
    final String nome;
    final double nota;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        if (Double.compare(nota, aluno.nota) != 0) return false;
        return Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nome != null ? nome.hashCode() : 0;
        temp = Double.doubleToLongBits(nota);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

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
