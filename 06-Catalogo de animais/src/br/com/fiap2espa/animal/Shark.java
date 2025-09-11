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
