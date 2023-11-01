package tn.esprit.gestionzoo.main;

import java.util.Scanner;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo myZoo = new Zoo();
        Animal animal = new Animal();

        try {
            myZoo.addAnimal(animal);
            System.out.println("Animal added to the zoo.");
        } catch (ZooFullException e) {
            System.out.println("Failed to add animal. Zoo is full.");
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age for the animal.");
        }
}}