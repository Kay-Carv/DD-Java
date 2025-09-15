package br.com.fiap2espa.animal;

public abstract class Animal {
    //Incapsulamento / Propriedades
    private String sciName;
    private String popName;
    private int maxAge;
    private double mediumMass;
    private Color color;

    //Constructors
    //public Animal() {} //Não tem propósito de instanciar na classe Drive LOGO NÃO É NECESSÁRIO (A classe abstrata não instanciara objetos e o construtor vazio não precisa ser chamado nas classes inferiores

    public Animal() {} //Construtor padrão para testes (ter disponibilidade de construtores vazios nas classes abaixo

    public Animal( String sciName, String popName, int maxAge, double mediumMass, Color color ) {
        this.sciName = sciName;
        this.popName = popName;
        this.maxAge = maxAge;
        this.mediumMass = mediumMass;
        this.color = color;
    }

    //Behaviors                           abstract = Declarado em uma super classe e depois declarar em outra
    public abstract void born();        //Deixe o método o mais específico possível. Uso de abstract

    public abstract void eat();

    public abstract void grow();

    public abstract void repoduce();

    public abstract void die();

    //Atalho (alt + insert) generate -> Getter e Setter
    public String getSciName() {
        return sciName;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName;
    }

    public String getPopName() {
        return popName;
    }

    public void setPopName(String popName) {
        this.popName = popName;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public double getMediumMass() {
        return mediumMass;
    }

    public void setMediumMass(double mediumMass) {
        this.mediumMass = mediumMass;
    }

    public Color getColor() { return color;}

    public void setColor(Color color) { this.color = color; }

    @Override
    public String toString() {
        return "\nNome cientifíco: " + sciName +
                "\nNome popular: " + popName +
                "\nIdade máxima: " + maxAge +
                "\nMassa/Peso médio: " + mediumMass +
                "\nCor: " + color;
    }
}
