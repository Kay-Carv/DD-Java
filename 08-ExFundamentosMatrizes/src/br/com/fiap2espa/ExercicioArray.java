package br.com.fiap2espa;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioArray {

    public static void main(String[] args) {
    //1. Declare uma pontuação do nome de array de uma dimensão do tipo int que possa conter 9 valores.
        int[] array = new int[9];

    //2. Declare um array bidimensional chamado price do tipo flutuante que tenha 10 linhas e 3 colunas.
        int linhas, colunas;
        linhas = 10;
        colunas = 3;

        float[][] price = new float[linhas][colunas];

    //3. Declare e inicialize um array bidimensional denominado matrix do tipo long que tenha 4 linhas e 3 colunas para ter todos os valores definidos como 5.

        long[][] matrix = new long[4][3];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j ++)
            // Arrays.fill(matrix[i], 5);           Outra forma de fazer seguindo a IDE
                matrix[i][j] = 5;
                System.out.println(Arrays.deepToString(matrix) + "\t");
        }

    //4. Declare e inicialize um array de byte unidimensional denominado values de tamanho 10 para que todas as entradas contenham 1.
        byte[] values = new byte[10];
        Arrays.fill(values, (byte) 1);
        System.out.println(Arrays.toString(values));

//        for (int i = 0; i < values.length; i ++) {
//            values[i] = (byte) 1;
//        }
//        System.out.println(Arrays.deepToString(values));

    // 5. Sem digitar o código, determine a saída do seguinte programa.
        // int num[] = {7,7,6,6,5,5,4,4};
        //for(int i = 0; i < 8; i = i + 2)
        //      System.out.print(num[i]);
        // R: 7, 6, 5, 4

        //Resposta
        int num[] = {7,7,6,6,5,5,4,4};
        for(int i = 0; i < 8; i = i + 2) {
            System.out.print(num[i]);
        }
        //Output: 7654

        System.out.println();

    //5. Sem digitar o código, determine a saída do seguinte programa.
        // int[][] num = {{3,3,3},{2,2,2}};
        // int[] array = {4,3,2};
        // for(int i = 0; i < 3; i++){
        //      num[1][i] = num[0][i]+array[i];
        //}
        // for(int i = 0; i < 2; i++){
        //      for(int j = 0; j < 3; j++){
        //          System.out.print(num[i][j]);
        //      }
        //      System.out.println();
        //}
        //R: 3 3 3 6 5 4

        int[][] num1 = {{3,3,3},{2,2,2}};
        int[] array1 = {4,3,2};
        for(int i = 0; i < 3; i++){
            num1[1][i] = num1[0][i]+array[i];
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(num1[i][j]);
            }
            System.out.println();
        }
        //Output:       333
        //              333


        // 7. Em determinada aula, há 5 testes, cada um valendo 100 pontos. Crie um programa que considere as pontuações dos 5 testes
        //do usuário, armazene as pontuações em um array e, em seguida, calcule a média dos alunos.

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int quantidadeTestes = 5;

        int[] testes = new int[quantidadeTestes];

        System.out.println("===Sistema para calcular média de testes===");
        while (i < quantidadeTestes) {
            System.out.println("Digite o valor do teste");
            int teste = scanner.nextInt();

            testes[i] = teste;

            i ++;
        }
        double media;
        int soma = 0;

        for ( int j = 0; j < testes.length; j ++) {
            soma += testes[j];
        }
        media = (double)soma / testes.length ;

        System.out.println(media);

        System.out.println("===Fim do sistema===");
        scanner.close();
    }
}
