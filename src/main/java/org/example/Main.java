package org.example;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal animal = new Cat();
        zoo.addAnimal(animal);
        animal = new Dog();
        zoo.addAnimal(animal);
        animal = new Cow();
        zoo.addAnimal(animal);

        zoo.printAllAnimals();
        zoo.makeAllAnimalSounds();
    }
}