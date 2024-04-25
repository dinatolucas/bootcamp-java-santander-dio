package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Itens> itensCarrinho;

    public CarrinhoCompras() {
        this.itensCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itensCarrinho.add(new Itens(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Itens> itensParaRemover = new ArrayList<>();
        if (!itensCarrinho.isEmpty()) {
            for (Itens i : itensCarrinho) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itensCarrinho.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    public double calcularValorTotal() {
        double somaTotal = 0;
        for (Itens ic : itensCarrinho) {
            double soma = ic.getPreco() * ic.getQuantidade();
            somaTotal += soma;
        }
        System.out.printf("O valor do seu carrinho é de R$ %.2f reais", somaTotal);
        System.out.println();
        return somaTotal;
    }

    public void exibirItens() {
        System.out.println(itensCarrinho);
    }
}
