package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin() {
    }

    public float getSwimmingDepth() {
        return this.swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public String toString() {
        return "famille : " + this.family + ", nom : " + this.name + ", age : ," + this.age + ", mammifère : " + this.isMammal + ", habitat : " + this.habitat + " et swimmingDepth : " + this.swimmingDepth;
    }}