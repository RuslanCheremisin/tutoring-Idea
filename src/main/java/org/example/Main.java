package org.example;

import org.example.hw2_religious_service.ReligiousService;
import org.example.hw2_religious_service.ReligiousServiceCollection;
import org.example.hw2_religious_service.buddhism.BuddhistReligiousService;
import org.example.hw2_religious_service.buddhism.Language;
import org.example.hw2_religious_service.christianity.ChristianReligiousService;
import org.example.hw2_religious_service.christianity.Denomination;
import org.example.hw2_religious_service.islam.IslamicReligiousService;

public class Main {
    public static void main(String[] args) {
// HW 2
        ReligiousServiceCollection collection = new ReligiousServiceCollection();

        ReligiousService service = new ChristianReligiousService("New christian service", 90, 0L, Denomination.EVANGELIC);
        collection.addService(service);
        service = new IslamicReligiousService("New islamic service", 240, 5000L, "Dagestan");
        collection.addService(service);
        service = new BuddhistReligiousService("New buddhist service", 720, 500L, Language.NEPALI);
        collection.addService(service);
        System.out.println(service);

        System.out.println(collection.getServices());
        System.out.println(collection.getTotalServiceDuration());
        System.out.println(collection.getTotalServicePrice());

// HW 1
//        Zoo zoo = new Zoo();
//        Animal animal = new Cat();
//        zoo.addAnimal(animal);
//        animal = new Dog();
//        zoo.addAnimal(animal);
//        animal = new Cow();
//        zoo.addAnimal(animal);
//
//        zoo.printAllAnimals();
//        zoo.makeAllAnimalSounds();
    }
}