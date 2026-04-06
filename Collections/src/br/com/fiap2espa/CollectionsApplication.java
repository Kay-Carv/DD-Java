//Classe drive onde a gente testa tudo


package br.com.fiap2espa;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class CollectionsApplication {
    public static void main(String[] args) {
        //.Collection estrutura estrutural que cria as regras de classes que implementam
        //--Interface List <> -- Equivalente a list do python
            //--ArrayList<> -- Principal classe que implementa a interface list
        ArrayList<String> primeiraList = new ArrayList<>();
        primeiraList.add("Oi meu nome é Kayque");
        primeiraList.add("Palavra apenas palavras");
        primeiraList.add("Salve mano");

        System.out.println("A quantidade de itens da primeiraLista: " + primeiraList.size());

        primeiraList.add("Devoradores de estrelas");

        System.out.println("A quantidade de itens da primeiraLista: " + primeiraList.size());

        System.out.println(primeiraList);   //Output: [Oi meu nome é Kayque, Palavra apenas palavras, Salve mano, Devoradores de estrelas]

        for (String temp : primeiraList) {
            System.out.println(temp);
        }

        //Verificação de informação dentro da lista
        System.out.println(primeiraList.contains("Devoradores de estrelas"));
        System.out.println(primeiraList.contains("Kayque"));

        System.out.println(primeiraList.get(2));
        System.out.println(primeiraList.get(primeiraList.size()-1));

        primeiraList.addAll(List.of("dgd", "djskg"));
        System.out.println(primeiraList);

        // Ordem Lexicográfica
        primeiraList.sort(Comparable<String>::compareTo); //Método compareTo para comparação e  de strings usando Lambda
        System.out.println(primeiraList);

        //Criando segunda lista -- //Se fosse uma lista de Strings iria puxar pela ordem Lexicográfica
        ArrayList<Integer> segundaList = new ArrayList<>();
        segundaList.add(32);
        segundaList.add(19);
        segundaList.add(4);
        segundaList.add(353);

        System.out.println(segundaList);

        segundaList.sort(Comparable<Integer>::compareTo);
        System.out.println(segundaList);

        //--Interface SET   -- Equivalente a tuple do python
            //--HashSet<>
        Set<String> terceiraLista = new HashSet<>();
        terceiraLista.add("palavrão");
        terceiraLista.add("noite");
        terceiraLista.add("manhã");
        terceiraLista.add("tarde");
        terceiraLista.addAll(List.of("noite", "manhã", "tarde", "Canalha"));
        System.out.println(terceiraLista.size());
        System.out.println(terceiraLista);
        //System.out.println(terceiraLista.get(0));   //Tupla(set) não consegue acessar o dado pois a gente perde a referência de ordenação

        for (String print: terceiraLista) {
            System.out.println(print);
        }


        //Utilização de TreeSet já vem ordenado
        Set<String> quartaLista = new TreeSet<>();
        quartaLista.add("palavrão");
        quartaLista.add("noite");
        quartaLista.add("manhã");
        quartaLista.add("tarde");
        quartaLista.addAll(List.of("noite", "manhã", "tarde", "Canalha"));
        System.out.println(quartaLista.size());
        System.out.println(quartaLista);

        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("A arte da Guerra", "Estratégia"));
        livros.add(new Livro("Neuromancer", "Ficção"));
        livros.add(new Livro("O estranho Misterioso", "Suspense"));
        livros.add(new Livro("Capitães de Areia", "Romance"));
        livros.add(new Livro("Spy X Family", "Comedia"));

        for (Livro temp: livros) {
            System.out.println(temp);
        }

        livros.sort(Comparator.comparing(Livro::getTitulo));
        System.out.println(livros);

        //--Map<>             -- Equivalente a Dictionary
            //--HashMap<>
    }
}
