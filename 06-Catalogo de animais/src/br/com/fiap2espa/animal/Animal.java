package br.com.fiap2espa.animal;

public abstract class Animal {
    //Incapsulamento / Propriedades
    private String sciName;
    private String popName;
    private int maxAge;
    private double mediumMass;


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
}
