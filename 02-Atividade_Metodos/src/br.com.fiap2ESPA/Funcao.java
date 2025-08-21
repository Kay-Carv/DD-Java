package br.com.fiap2ESPA;

import java.util.Scanner;

public class Funcao {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);


//Crie uma função que receba um nome e imprima: "Olá, [nome], seja bem-vindo ao programa!". No main, peça o nome do usuário e chame a função.
        System.out.println("\nEscreva o nome que será chamado pela função (método)");
        String nome = leitor.next();
        leitor.nextLine();  //Limpa as próximas palavras do buffer
        chamarNome(nome);

//Escreva uma função que receba um número e retorne seu dobro. No main, leia um número do usuário, chame a função e mostre o resultado.
        System.out.println("\nEscreve um número para saber qual é o seu dobro: ");
        int number = leitor.nextInt();
        int resultado = dobroNumero(number);
        System.out.println("O dobro do número " + number+ " é igual a " + resultado);

//Crie uma função que retorne true se o número for par e false caso contrário. No main, leia um número e mostre se ele é par ou ímpar.
        System.out.println("\nEscreva um número para saber se impar ou par");
        int x = leitor.nextInt();
        ehPar(x);
/*      int y = 2;
        int teste = x % y;
        System.out.println(teste == 0);     true or false se for par ou impar*/

//Faça uma função que receba dois números e retorne o maior deles. Teste chamando a função em main.
        System.out.println("\n=== Descubra o maior valor dentre dois números ===\n");
        System.out.println("Escreva o primeiro número");
        double num1 = leitor.nextDouble();
        System.out.println("Escreva o segundo número");
        double num2 = leitor.nextDouble();

        System.out.println("O maior número entre " + num1 + " e " + num2 + " é = " + maiorNumero(num1, num2));

//Crie uma função que retorne a área de um círculo. (Fórmula: área = π * raio², use π = 3.1415). No main, peça o diâmetro ao usuário e mostre o resultado.
        System.out.println("\n=== Calculo da área de um círculo ===");
        System.out.println("\nDigite o diâmetro de um circulo para calcular a sua área");
        double diametro = leitor.nextDouble();
        System.out.println("A área de um círculo cujo o diâmetro é " + diametro + "equivale à " + areaCirculo(diametro));

        leitor.close();
    }

    // Função para chamar nome
    static void chamarNome (String nome) {
        System.out.println("Olá " + nome + ", seja bem-vindo ao programa!");
    }

    //Método para achar o dobro de um número inteiro
    static int dobroNumero (int number) {
        number = number * 2;
        return number;
    }

    //Função para verificar se o número é oar ou impar
    static void ehPar (int valor) {
        boolean parOuImpar = valor % 2 == 0;
        System.out.println("O número " + valor + " é par? == " + parOuImpar);
    }

    //Método para achar o maior valor dentre dois números
    static double maiorNumero (double x,double y) {
        return Math.max(x, y);      //retorna o maior número
    }

    //Calcular área do círculo
    static double areaCirculo (double diametro ) {
        double pi = 3.1415;
        double raio = diametro / 2;
        return Math.pow(raio, 2) * pi;   //Math.pow(base, expoente) serve para elevar um número
    }
}
