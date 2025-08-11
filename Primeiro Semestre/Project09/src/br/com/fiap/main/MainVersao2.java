package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import java.util.Scanner;

public class MainVersao2 {
    public static void main(String[] args) {
        Pessoa pessoa1;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o seu nome e ano de nascimento");


            pessoa1 = new Pessoa(scan.nextLine(), scan.nextInt());
            //int idadePessoa1 = pessoa1.calcularIdade(2025);

            System.out.printf("Pessoa 1 \n Nome: %s \nIdade: %d anos",pessoa1.getNome(),pessoa1.calcularIdade(2025));

        } catch(Exception e)

        {
            System.out.println("Nome ou ano inválido");
        }

    }

}
