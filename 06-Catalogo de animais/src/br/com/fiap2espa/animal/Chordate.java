package br.com.fiap2espa.animal;

public abstract class Chordate extends Animal{
    //Constructors
    public Chordate(String sciName, String popName, int maxAge, double mediumMass) {
        super(sciName, popName, maxAge, mediumMass);
    }

    public Chordate() {
        super();
    }
}
