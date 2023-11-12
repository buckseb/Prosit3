package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food>  {
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

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial is eating meat.");
        } else {
            System.out.println("Terrestrial does not eat this type of food.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Terrestrial is eating plant.");
        } else {
            System.out.println("Terrestrial does not eat this type of food.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("Terrestrial is eating both plant and meat.");
    }
}
