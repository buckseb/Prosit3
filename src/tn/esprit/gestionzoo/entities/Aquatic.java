package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal implements Carnivore<Food>  {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public Aquatic() {
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String toString() {
        return "famille : " + this.family + ", nom : " + this.name + ", age : ," + this.age + ", mammifère : " + this.isMammal + " et habitat : " + this.habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;}
        else if (o != null && this.getClass() == o.getClass()) {
            Aquatic aquatic = (Aquatic)o;
            return aquatic.getName().equals(this.getName()) && aquatic.getAge() == this.getAge() && aquatic.getHabitat().equals(this.getHabitat());
        } else {
            return false;
        }
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Aquatic is eating meat.");
        } else {
            System.out.println("Aquatic does not eat this type of food.");
        }
    }
}