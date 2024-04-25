package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1: // Depositar
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3: // Consultar Saldo
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0: // Encerrar
                    System.out.println("Programa encerrado.");
                    scanner.close();  // Importante fechar o scanner antes de sair
                    return; // Encerra o método main e consequentemente o programa
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}