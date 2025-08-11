// Murillo Fernandes Carapia, RM:564969
// Leonardo Zerbinatti de Sales, RM: 562992
// Gustavo Mendes da Rosa Moreira, RM:565807
// Luiz Gustavo Guedes, RM: 565843


package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;

public class Aluno {
    //atributos
    private int registroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;
    //construtores

    public Aluno() {
    }

    public Aluno(int registroMatricula, String nomeCompleto, int anoDeNascimento) {
        this.registroMatricula = registroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.anoDeNascimento = anoDeNascimento;
    }

    //metodo setters/getters


    public int getRegistroMatricula() {

        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula) {
        try {

            if (registroMatricula >= 80000 && registroMatricula <= 599999){
                this.registroMatricula = registroMatricula;

            }else{
                JOptionPane.showMessageDialog(null, "Número de matrícula invalida! (80000 a 599999)");

            }



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        try {
            this.nomeCompleto = nomeCompleto;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        LocalDate dataAtual = LocalDate.now();
        try {

            if (anoDeNascimento >= 1945 && anoDeNascimento <= dataAtual.getYear() ){
                this.anoDeNascimento = anoDeNascimento;


            } else {
                JOptionPane.showMessageDialog(null, "Número de nascimento inválido! (Ano mínimo: 1945 e Ano máximo: Ano atual) ");

            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    //métodos
    public int calcularIdade (LocalDate dataAtual){
        return  dataAtual.getYear() - anoDeNascimento;

    }

}
