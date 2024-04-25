package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionarItem("Arroz", 10, 5);
        carrinho.adicionarItem("Feijão", 10, 10);
        carrinho.exibirItens();
        carrinho.calcularValorTotal();
        carrinho.removerItem("Arroz");
        carrinho.exibirItens();
        carrinho.calcularValorTotal();

        sc.close();
    }
}