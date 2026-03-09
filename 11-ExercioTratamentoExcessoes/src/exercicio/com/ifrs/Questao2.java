package exercicio.com.ifrs;

import java.util.Scanner;

/*2. Nesta questão você deve identificar as partes problemáticas do código e reescrevê-lo
utilizando tratamento de exceções. Ou seja, devem ser identificadas todas as exceções que
podem ser levantadas e, para cada uma, deve ser dado o tratamento adequado que, nesse
exercício, significa alertar o usuário quanto ao problema. Entretanto, nesse programa a leitura
dos valores deve ser feita, mesmo que para isso o usuário tenha que tentar informar várias
vezes os valores na mesma execução do programa.*/


public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eu sei dividir!");
        boolean continuar = true;

        do {
            try {
                System.out.println("Informe o primeiro valor ");
//              Válida se o primeiro valor é um número inteiro
                if (!scanner.hasNextInt()){
                    throw new  NumeroNaoInteiro("O primeiro número digitado não é um inteiro");
                }
                int x = scanner.nextInt();

                System.out.println("Informe o segundo valor ");
//              Válida se o segundo valor é um número inteiro
                if (!scanner.hasNextInt()){
                    throw new NumeroNaoInteiro("O segundo número digitado não é um inteiro");
                }
                int y  = scanner.nextInt();

                if (y == 0){
                    throw new DivizaoPorZeroException("Não é possível dividir por zero!");
                }

                double r = ((double) x /y);
                System.out.println("O resultado da divisão é " + r);
                continuar = false;

            } catch (DivizaoPorZeroException | NumeroNaoInteiro e){
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
            catch (Exception e) {
                System.out.println("Erro genérico");
                scanner.nextLine();
            }
        } while (continuar);
        scanner.close();
    }
}
