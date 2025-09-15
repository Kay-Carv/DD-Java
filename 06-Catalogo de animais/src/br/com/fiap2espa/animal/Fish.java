package br.com.fiap2espa.animal;

public abstract class Fish extends Chordate implements Aquatic{ //Implementando interface Aquatic
    //Constructors
    public Fish(String sciName, String popName, int maxAge, double mediumMass, Color color) {
        super(sciName, popName, maxAge, mediumMass, color);
    }

    public Fish() {
        super();
    }
}
