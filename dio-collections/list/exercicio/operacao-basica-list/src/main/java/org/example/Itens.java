package org.example;

public class Itens {

    private String nome;
    private double preco;
    private int quantidade;

    public Itens(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String name) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item do carrinho: " +
                "Produto= " + nome +
                ", Preço= " + preco +
                ", Quantidade =" + quantidade;
    }
}
