package br.com.fiap2espa.animal;

public class Shark extends Fish{
    //Propriedades
    private int numOfFins;


    //Constructors (Quase Sempre é public)
    public Shark() {
        super();
    }

    public Shark(String sciName, String popName , int maxAge, double mediumMass, int numOfFins){
        super(sciName, popName, maxAge, mediumMass);//Invocando o construtor da superclasse
        this.numOfFins = numOfFins;
    }

    //Behaviors
    //POLIMORFISMO == Específicando método
    @Override
    public void born(){
        System.out.println("\nTubarão nascendo!");
    }

    @Override
    public void eat(){
        System.out.println("Tubarão comendo!");
    }

    @Override
    public void grow(){
        System.out.println("Tubarão crescendo!");
    }

    @Override
    public void repoduce() {
        System.out.println("Tubarão reproduzindo!");
    }

    @Override
    public void die() {
        System.out.println("Tubarão morrendo D:");
    }

    public int getNumOfFins() {
        return numOfFins;
    }

    public void setNumOfFins(int numOfFins) {
        this.numOfFins = numOfFins;
    }

    @Override //Método padrão que substitui uma classe superior
    public String toString() {
        return super.toString() + "\número de nadadeiras: " + numOfFins;
    }
}
