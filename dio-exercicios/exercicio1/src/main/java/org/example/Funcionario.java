package org.example;

public class Funcionario {
    private String name;
    private double salarioBruto;
    private double beneficios;

    public Funcionario(String name, double salarioBruto, double beneficios) {
        this.name = name;
        this.salarioBruto = salarioBruto;
        this.beneficios = beneficios;
    }

    public double calcularSalario() {
        double taxRate = obterAlicotaImposto();
        double salarioLiquido = salarioBruto - (salarioBruto * taxRate);
        return salarioLiquido + beneficios;
    }

    private double obterAlicotaImposto() {
        if (salarioBruto <= 1100.0) {
            return 0.05;
        } else if (salarioBruto <= 2500.0) {
            return 0.10;
        } else {
            return 0.15;
        }
    }

    public void exibirDetalhesSalario() {
        double taxRate = obterAlicotaImposto();
        double salarioLiquido = salarioBruto - (salarioBruto * taxRate);
        double salarioTotal = salarioLiquido + beneficios;

        System.out.printf("O salário líquido de %s é R$ %.2f com alíquota de %.1f%%.\n", name, salarioLiquido, taxRate * 100);
        System.out.printf("Incluindo benefícios de R$ %.2f, o salário total é R$ %.2f.\n", beneficios, salarioTotal);
    }
}
