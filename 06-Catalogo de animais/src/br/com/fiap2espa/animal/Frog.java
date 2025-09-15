package br.com.fiap2espa.animal;

public class Frog extends Amphibian{
    @Override
    public void born() {
        System.out.println("Sapo nascendo! ");
    }

    @Override
    public void eat() {
        System.out.println("Sapo comendo!");
    }

    @Override
    public void grow() {
        System.out.println("Sapo crescendo! ");
    }

    @Override
    public void repoduce() {
        System.out.println("Sapo reproduzindo!");
    }

    @Override
    public void die() {
        System.out.println("Sapo morrendo D:");
    }

    @Override
    public void swin() {
        System.out.println("Sapo nadando! ");
    }

    @Override
    public void walk() {
        System.out.println("Sapo pulando! ");
    }
}
