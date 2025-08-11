package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 =  new Pessoa("Vitor",1998);

        pessoa1.setNome("Astrogildo");
        pessoa1.setAnoNascimento(2050);
        int idadePessoa1 = pessoa1.calcularIdade(2025);


        System.out.printf("Pessoa 1 \n Nome: %s \nIdade: %d anos",pessoa1.getNome(),idadePessoa1);

        System.out.printf("\nPessoa 2 \n Nome: %s \nIdade: %d anos",pessoa2.getNome(),pessoa2.calcularIdade(2025));
    }
}
