package exercicio.com.ifrs;

/*
* Disciplina: PROGRAMAÇÃO COM ACESSO A BANCO DE DADOS
1. O código abaixo lança uma exceção (propositalmente) e interrompe sua execução.
Utilizando o tratamento de exceções, corrija a classe com o objetivo de não parar sua
execução.
OBS:: A Exception lançada é ArrayIndexOutOfBoundsException.
* */


public class TesteException {

    public static void main(String[] args) throws LenghtArrayException {
       try {
           System.out.println("\ninicio main");
           metodo1();
           System.out.println("\nFim do main");
       } catch (LenghtArrayException e) {
           System.out.println(e.getMessage());
       } catch (Exception e){
           System.out.println("erro genérico");
       }
    }

    static void metodo1() throws LenghtArrayException{
        System.out.println("Inicio método 1");
        metodo2();

    }

    static void metodo2() throws LenghtArrayException{
        System.out.println("Inicio do método2");
        int[] array = new int[14];
        for(int i = 0; i <= 15; i++ ) {
            array[i] = i;
            System.out.println(i);
            if (i >= array.length - 1) {
                throw new LenghtArrayException("Tamanho do Array é curto");
            }
        }
        System.out.println("fim método2");
    }
}
