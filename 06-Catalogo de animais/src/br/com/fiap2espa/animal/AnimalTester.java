package br.com.fiap2espa.animal;

public class AnimalTester {
    public static void main(String[] args) {
        //Shark shark1 = new Shark();


        //Constructors (Quase Sempre é public)


        //shark1.setNumOfFins(5);
        /*shark1.setPopName("Tubarão Tigre");
        shark1.setSciName("Galeiocerdo cuvier");
        shark1.setMaxAge(100);
        shark1.setMediumMass(250);*/

        /*System.out.println(shark1);     //Dessa forma, ele traz o valor onde está na memória stack RIP (como se fosse um HD)
        System.out.println("Nome cientifico: " + shark1.getSciName());
        System.out.println("Nome popular: " + shark1.getPopName());
        System.out.println("Idade máxima: " + shark1.getMaxAge());
        System.out.println("Peso médio: " + shark1.getMediumMass());
        System.out.println("Número de nadadeiras: " + shark1.getNumOfFins());*/

        //Abstração popular
        //Instanciar o objeto
        Shark shark1 = new Shark("Galeio cerdo cuvier", "Tubarão Tigre", 100, 250.0, 5);
        Shark shark2 = new Shark("Carcharodon carcharias", "Tubarão Branco", 80, 800.0, 5);


        System.out.println(shark1);
        System.out.println(shark2);

        //Para testes
        Shark shark = new Shark();
        System.out.println(shark);

        shark.setMediumMass(170);
        shark.setNumOfFins(3);
        System.out.println(shark);

        shark.setPopName("Tubarão top");
        System.out.println(shark);

        Whale whale = new Whale("Baleia Azul", "Baleia Azul",120, 2000, 320);
        System.out.println(whale);
    }
}