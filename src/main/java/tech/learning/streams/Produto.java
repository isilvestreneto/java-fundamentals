package tech.learning.streams;

public class Produto {
    final String nome;
    final float preco;
    final float desconto;
    final boolean isFreteGratis;

    public Produto(String nome, float preco, float desconto, boolean isFreteGratis) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.isFreteGratis = isFreteGratis;
    }
}
