package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do funcionário:");
            String nome = sc.nextLine();
            System.out.println("Digite o salário bruto do funcionário:");
            double salarioFuncionario = sc.nextDouble();
            System.out.println("Digite o benefício do funcionário:");
            double beneficioFuncionario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(nome, salarioFuncionario, beneficioFuncionario);
            funcionario.exibirDetalhesSalario();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira valores numéricos adequados para salário e benefícios.");
        } finally {
            sc.close();
        }
    }
}
