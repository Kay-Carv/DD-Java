package br.com.fiap2espa.animal;

public class Whale extends Mammal implements Aquatic{
    //Properties
    private double length;

    //Constructors
    public Whale(String sciName, String popName, int maxAge, double mediumMass, double length, Color color) {
        super(sciName, popName, maxAge, mediumMass, color);
        this.length = length;
    }

    @Override
    public String toString() {
        //return "\nComprimento" + length; -----> sem a classe super o Animal tester ira retornar apenas o comprimento sem os outros atributos dos animais
        return super.toString() + "\nComprimento" + length;
    }


    @Override
    public void born() {
        System.out.println("Baleia nascendo! ");
    }

    @Override
    public void eat() {
        System.out.println("Baleia comendo! ");
    }

    @Override
    public void grow() {
        System.out.println("Baleia crescendo! ");
    }

    @Override
    public void repoduce() {
        System.out.println("Baleia reproduzindo");
    }

    @Override
    public void die() {
        System.out.println("Baleia morrendo D: ");
    }

    @Override
    public void swin() {
        System.out.println("Baleia nadando! ");
    }
}
