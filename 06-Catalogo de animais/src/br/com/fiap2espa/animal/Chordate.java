package br.com.fiap2espa.animal;

public abstract class Chordate extends Animal{
    //Constructors
    public Chordate(String sciName, String popName, int maxAge, double mediumMass, Color color) {
        super(sciName, popName, maxAge, mediumMass, color);
    }

    public Chordate() {
        super();
    }
}
