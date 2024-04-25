package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println("Descreva sua tarefa: ");
        String tarefa = sc.nextLine();
        listaTarefa.adicionarTarefa(tarefa);
        System.out.println("O numero de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Estudar Ingles");
        System.out.println("O numero de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricaoTarefa();
        listaTarefa.removerTarefa("Estudar Java");
        listaTarefa.obterDescricaoTarefa();
        System.out.println("O numero de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        sc.close();
    }
}