package br.com.fiap2espa.animal;

public class Whale extends Mammal {
    //Properties
    private double length;

    //Constructors
    public Whale(String sciName, String popName, int maxAge, double mediumMass, double length) {
        super(sciName, popName, maxAge, mediumMass);
        this.length = length;
    }

    @Override
    public String toString() {
        //return "\nComprimento" + length; -----> sem a classe super o Animal tester ira retornar apenas o comprimento sem os outros atributos dos animais
        return super.toString() + "\nComprimento" + length;
    }
}
