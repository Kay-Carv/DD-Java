package br.com.fiap2espa.animal;

public abstract class Fish extends Chordate{
    //Constructors
    public Fish(String sciName, String popName, int maxAge, double mediumMass) {
        super(sciName, popName, maxAge, mediumMass);
    }

    public Fish() {
        super();
    }
}
