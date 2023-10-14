package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial() {
    }

    public int getNbrLegs() {
        return this.nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public String toString() {
        return "famille : " + this.family + ", nom : " + this.name + ", age : ," + this.age + ", mammifère : " + this.isMammal + " et nbrLegs : " + this.nbrLegs;
    }
}
