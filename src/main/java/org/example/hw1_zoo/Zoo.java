package org.example.hw1_zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        if (animal != null) {
            animals.add(animal);
        } else {
            throw new IllegalArgumentException("animal is null");
        }
    }

    public void printAllAnimals() {
        animals.stream().forEach(a -> System.out.println(a.getClass().getSimpleName()));
    }

    public void makeAllAnimalSounds() {
        animals.stream().forEach(a -> a.makeSound());

    }
}
