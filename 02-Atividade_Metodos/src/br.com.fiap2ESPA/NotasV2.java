// Sistema com médias para cálculo de médias das notas dos alunos

package br.com.fiap2ESPA;

import java.util.Scanner;

public class NotasV2 {
    public  static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("=== Sistema: Médias de notas ===");

        //Métodos main
        coletarNotificarAluno(leitor, "Aluno 1");

        coletarNotificarAluno(leitor, "Alunoo 2");

        coletarNotificarAluno(leitor, "Aluno 3");

        leitor.close();     //Fechar Scanner
    }   //Fim de métodos main

    //Coletar Nome do aluno
    static void coletarNotificarAluno (Scanner leitor, String aluno){ //Usa o Scanner leitor e a string "Aluno"
        System.out.println("Digite o nome do" + aluno + ":");
        String nome = leitor.next();
        leitor.nextLine();

        double media = coletarNotas(leitor, nome);
        verificarAprovacao(nome, media);
    }

    //Coletar e calcular média
    static double coletarNotas (Scanner leitor, String nomeAluno) {
        System.out.println("Digite as notas do aluno: " + nomeAluno);

        System.out.println("Digite o valor da Primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite o valor da Segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Digite o valor da Terceira nota: ");
        double nota3 = leitor.nextDouble();

        return (nota1 + nota2 + nota3) / 3;
    }

    //Validar aprovação
    static void verificarAprovacao(String nome, Double media) {
        if (media >= 6) {
            System.out.println("O(a) aluno(a) " + nome + "foi aprovado(a) com " + media + " de nota na média final");
        } else {
            System.out.println("O(a) aluno(a)" + nome + "foi reprovado(a) com " + media + " de média na sua nota final");
        }
    }

}