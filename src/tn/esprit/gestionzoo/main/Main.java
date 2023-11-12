package tn.esprit.gestionzoo.main;

import java.util.Scanner;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();

        aquatic.eatMeat(Food.MEAT);
        aquatic.eatMeat(Food.PLANT);

        terrestrial.eatMeat(Food.MEAT);
        terrestrial.eatPlant(Food.PLANT);
        terrestrial.eatPlantAndMeat(Food.BOTH);
}
}