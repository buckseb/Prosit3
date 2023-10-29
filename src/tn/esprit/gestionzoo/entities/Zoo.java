package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount;
    private final int MAX = 25;
    private Aquatic[] aquaticAnimals;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = MAX;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
        aquaticAnimals = new Aquatic[10];
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        if (!isZooFull()) {
            animals[animalCount++] = animal;
            return true;
        } else {
            System.out.println("The zoo is full. Cannot add more animals.");
            return false;
        }
    }

    public int searchAnimal(Animal animalToSearch) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animalToSearch)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animalToRemove) {
        int index = searchAnimal(animalToRemove);
        if (index != -1) {
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null; // Clear the last element
            animalCount--;
            return true;
        } else {
            System.out.println("Animal not found in the zoo.");
            return false;
        }
    }
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getAnimalCount() > z2.getAnimalCount()) {
            return z1;
        } else if (z1.getAnimalCount() < z2.getAnimalCount()) {
            return z2;
        } else {
            return z1;
        }
    }
    public int getAnimalCount() {
        return animalCount;
    }

    public float maxPenguinSwimmingDepth() {
        float max = 0.0F;
        Aquatic[] var2 = this.aquaticAnimals;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Aquatic animal = var2[var4];
            if (animal instanceof Penguin && ((Penguin)animal).getSwimmingDepth() > max) {
                max = ((Penguin)animal).getSwimmingDepth();
            }
        }

        return max;
    }

    public void displayNumberOfAquaticsByType() {
        int penguins = 0;
        int dolphins = 0;
        Aquatic[] var3 = this.aquaticAnimals;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Aquatic animal = var3[var5];
            if (animal instanceof Penguin) {
                ++penguins;
            }

            if (animal instanceof Dolphin) {
                ++dolphins;
            }
        }

        System.out.println("Penguins = " + penguins);
        System.out.println("Dolphins = " + dolphins);
    }

}