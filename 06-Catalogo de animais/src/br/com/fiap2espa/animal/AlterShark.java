package br.com.fiap2espa.animal;

public class AlterShark {
    private String sciName;
    private String popName;
    private int maxAge, numOfFins;
    private double mediumMass;

    public AlterShark(){};

    public AlterShark(String sciName, String popName, int maxAge, int numOfFins, double mediumMass) {
        this.sciName = sciName;
        this.popName = popName;
        this.maxAge = maxAge;
        this.numOfFins = numOfFins;
        this.mediumMass = mediumMass;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName;
    }

    public void setPopName(String popName) {
        this.popName = popName;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public void setNumOfFins(int numOfFins) {
        this.numOfFins = numOfFins;
    }

    public void setMediumMass(double mediumMass) {
        this.mediumMass = mediumMass;
    }

    @Override
    public String toString() {
        return "AlterShark{" +
                "sciName='" + sciName + '\'' +
                ", popName='" + popName + '\'' +
                ", maxAge=" + maxAge +
                ", numOfFins=" + numOfFins +
                ", mediumMass=" + mediumMass +
                '}';
    }
}
