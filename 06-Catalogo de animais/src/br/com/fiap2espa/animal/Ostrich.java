package br.com.fiap2espa.animal;

public class Ostrich extends Bird {
    @Override
    public void born() {
        System.out.println("Avestruz nascendo! ");
    }

    @Override
    public void eat() {
        System.out.println("Avestruz comendo! ");
    }

    @Override
    public void grow() {
        System.out.println("Avestruz crescendo! ");
    }

    @Override
    public void repoduce() {
        System.out.println("Avestruz reproduzindo! ");
    }

    @Override
    public void die() {
        System.out.println("Avestruz morrendo D: ");
    }
}
