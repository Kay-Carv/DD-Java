package br.com.fiap2espa;

//Matrizes: Calcular dimensões

import java.util.Scanner;

public class ArrayTester {
    public static void main(String[] args) {
        //Fazer um jogo de baralho
        //String naipe1 = "copas", nipe2 = "paus", nipe3 = "espadas", nipe4 = "ouro";

        //Declaração de matriz unidimensional (Informações num único elemento)
        /*String[] naipe = {"Copas", "Paus", "Espadas", "Ouro"};

        System.out.println(naipe[0]);*/

        Scanner scanner = new Scanner(System.in);

        // Declarando listas e o seu tamanho
        int[] valores = new int[4];
        String[] objeto = new String[5];

        System.out.println(valores[1]); // output: 0 = Isso acontece com todas as variáveis primitivas
        System.out.println(objeto[0]);  // output: null

        //System.out.println("\nInsira números inteiros para serem colocador na array: ");
//        valores[0] = scanner.nextInt();
//        valores[1] = scanner.nextInt();
//        valores[2] = scanner.nextInt();
//        valores[3] = scanner.nextInt();

//        System.out.println(valores[3]);
//        int[] valor = {100, 25, 42, -3};

        //Outra maneira de inicializar matriz
        int[] valor = new int[10];

//        int i = 0;
//        while (i< 10) {
//            System.out.println("Digite o valor: ");
//            valor[i] = scanner.nextInt();
//            i ++;
//        }
//
//        for (int i = 0; i < valor.length; i ++) {
//            System.out.println("Digite o valor: ");
//            valor[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < valor.length; i ++) System.out.print(valor[i] + " "); //Output: 1 2 3 4 5 6 7 8 9 10
//

        int[] valor1 = new int[10];

        for (int i = 0; i < valor1.length; i ++) {
            valor1[i] = i + 2;
        }

        for (int i = 0; i < valor1.length; i++) {
            System.out.print(valor1[i] + " ");
        }

        //Tabuado usando matriz
        System.out.println("\n===Tabuada utilizando matriz===");
        int[] tabuada = new int[11];

        for (int i = 0; i < tabuada.length; i ++) {
            tabuada[i] = i * 2;
        }

        for (int i = 0; i < tabuada.length; i++) {
            System.out.println(i + " X " + " 2 = " + tabuada[i]);
        }

        System.out.println("===FIM DA TABUADA===\n");

        //Matriz Bidimensional
        int linhas = 11;
        int colunas = 11;

        int[][] array = new int[linhas][colunas];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = j * i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(); //Para dar espaço e printar em formato de matriz
        }


        System.out.println("\n===Tabuada do 1 ao 10===\n");
        int[][] tabuadadacompleta = new int[11][11];
        for(int i = 0; i < tabuadadacompleta.length; i++) {
            for (int j = 0; j < tabuadadacompleta[i].length; j ++) {
                tabuadadacompleta[i][j] = i * j;
            }
        }

        for (int i = 1; i < tabuadadacompleta.length; i++) {
            for ( int j = 1; j < tabuadadacompleta[i].length; j++) {
                System.out.print(j + " x " + i + " = " + tabuadadacompleta[j][i] + "\t\t");
            }
            System.out.println();
        }
        /* output
        ===Tabuada do 1 ao 10===

        1 x 1 = 1		2 x 1 = 2		3 x 1 = 3		4 x 1 = 4		5 x 1 = 5		6 x 1 = 6		7 x 1 = 7		8 x 1 = 8		9 x 1 = 9		10 x 1 = 10
        1 x 2 = 2		2 x 2 = 4		3 x 2 = 6		4 x 2 = 8		5 x 2 = 10		6 x 2 = 12		7 x 2 = 14		8 x 2 = 16		9 x 2 = 18		10 x 2 = 20
        1 x 3 = 3		2 x 3 = 6		3 x 3 = 9		4 x 3 = 12		5 x 3 = 15		6 x 3 = 18		7 x 3 = 21		8 x 3 = 24		9 x 3 = 27		10 x 3 = 30
        1 x 4 = 4		2 x 4 = 8		3 x 4 = 12		4 x 4 = 16		5 x 4 = 20		6 x 4 = 24		7 x 4 = 28		8 x 4 = 32		9 x 4 = 36		10 x 4 = 40
        1 x 5 = 5		2 x 5 = 10		3 x 5 = 15		4 x 5 = 20		5 x 5 = 25		6 x 5 = 30		7 x 5 = 35		8 x 5 = 40		9 x 5 = 45		10 x 5 = 50
        1 x 6 = 6		2 x 6 = 12		3 x 6 = 18		4 x 6 = 24		5 x 6 = 30		6 x 6 = 36		7 x 6 = 42		8 x 6 = 48		9 x 6 = 54		10 x 6 = 60
        1 x 7 = 7		2 x 7 = 14		3 x 7 = 21		4 x 7 = 28		5 x 7 = 35		6 x 7 = 42		7 x 7 = 49		8 x 7 = 56		9 x 7 = 63		10 x 7 = 70
        1 x 8 = 8		2 x 8 = 16		3 x 8 = 24		4 x 8 = 32		5 x 8 = 40		6 x 8 = 48		7 x 8 = 56		8 x 8 = 64		9 x 8 = 72		10 x 8 = 80
        1 x 9 = 9		2 x 9 = 18		3 x 9 = 27		4 x 9 = 36		5 x 9 = 45		6 x 9 = 54		7 x 9 = 63		8 x 9 = 72		9 x 9 = 81		10 x 9 = 90
        1 x 10 = 10		2 x 10 = 20		3 x 10 = 30		4 x 10 = 40		5 x 10 = 50		6 x 10 = 60		7 x 10 = 70		8 x 10 = 80		9 x 10 = 90		10 x 10 = 100
        */

        scanner.close();
    }
}