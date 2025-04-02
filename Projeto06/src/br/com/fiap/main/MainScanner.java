package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salariob,inss,plano;
        int dependentes;
        System.out.println("Qual seu salário bruto?: ");
        salariob = sc.nextDouble();
        System.out.println("Quantas pessoas necessitam do plano de saúde?: ");
        dependentes = sc.nextInt();
        System.out.println("Qual a porcentagem de desconto do INSS?: ");
        inss = sc.nextDouble();
        System.out.println("Qual valor do plano de saúde?: ");
        plano = sc.nextDouble();

        FolhaDePagamento pag = new FolhaDePagamento();
        pag.salarioBruto = salariob;
        pag.numeroDeDependentes = dependentes;
        pag.descontoINSS = inss;
        pag.valorPlanoDeSaude = plano;
        System.out.printf("Salário Bruto: R$ %.2f \nN° de Dependentes: %d \nINSS: %.1f%% \nPlano de Saúde: %.2f \nSalário Líquido: R$ %.2f",pag.salarioBruto, pag.numeroDeDependentes,pag.descontoINSS,pag.valorPlanoDeSaude,pag.calcularSalarioLiquido());


    }
}
