package org.example;

import org.example.hw2_religious_service.model.ReligiousMinistry;
import org.example.hw2_religious_service.service.impl.BuddhistMinistryServiceImpl;
import org.example.hw2_religious_service.service.impl.ChristianMinistryServiceImpl;
import org.example.hw2_religious_service.model.buddhism.BuddhistReligiousMinistry;
import org.example.hw2_religious_service.model.buddhism.Language;
import org.example.hw2_religious_service.model.christianity.ChristianReligiousMinistry;
import org.example.hw2_religious_service.model.christianity.Denomination;
import org.example.hw2_religious_service.model.islam.IslamicReligiousMinistry;
import org.example.hw2_religious_service.service.impl.IslamicMinistryServiceImpl;
import org.example.hw3_tv.model.TV;
import org.example.hw3_tv.model.TVChannel;
import org.example.hw3_tv.model.TVRemote;

public class Main {
    public static void main(String[] args) {

//  HW 3

        TVChannel ort = new TVChannel("ОРТ", 1);
        TVChannel rtr = new TVChannel("РТР", 2);
        TVChannel renTV = new TVChannel("РенТВ", 3);
        TVChannel mtv = null;

        TVRemote remote = new TVRemote();
        remote.addChannel(ort);
        remote.addChannel(rtr);
        remote.addChannel(renTV);
//        remote.addChannel(mtv);
//        remote.addChannel(ort);

        remote.showAddedChannels();

        TV hitachi = new TV(ort, remote);

        remote.setCurrentChannel(ort.getChannelNumber());
        hitachi.showCurrentChannel();

        remote.setCurrentChannel(rtr.getChannelNumber());
        hitachi.showCurrentChannel();

        remote.setCurrentChannel(renTV.getChannelNumber());
        hitachi.showCurrentChannel();

        remote.removeChannel(renTV);

        hitachi.showCurrentChannel();

// HW 2
//        ChristianMinistryServiceImpl christianMinistryService = new ChristianMinistryServiceImpl();
//        IslamicMinistryServiceImpl islamicMinistryService = new IslamicMinistryServiceImpl();
//        BuddhistMinistryServiceImpl buddhistMinistryService = new BuddhistMinistryServiceImpl();
//
//        ReligiousMinistry service = new ChristianReligiousMinistry("1st christian service", 90, 0L, Denomination.EVANGELIC);
//        christianMinistryService.addService(service);
//        service = new ChristianReligiousMinistry("2nd christian service", 60, 10L, Denomination.EVANGELIC);
//        christianMinistryService.addService(service);
//
//        service = new IslamicReligiousMinistry("1st islamic service", 240, 5000L, "Dagestan");
//        islamicMinistryService.addService(service);
//        service = new IslamicReligiousMinistry("2nd islamic service", 250, 600L, "Teheran");
//        islamicMinistryService.addService(service);
//
//        service = new BuddhistReligiousMinistry("1st buddhist service", 720, 500L, Language.NEPALI);
//        buddhistMinistryService.addService(service);
//        service = new BuddhistReligiousMinistry("2nd buddhist service", 720, 500L, Language.NEPALI);
//        buddhistMinistryService.addService(service);
//
//        System.out.println(christianMinistryService.getServices());
//        System.out.println(christianMinistryService.getTotalServiceDuration());
//        System.out.println(christianMinistryService.getTotalServicePrice());
//        christianMinistryService.performBaptism();
//
//        System.out.println(islamicMinistryService.getServices());
//        System.out.println(islamicMinistryService.getTotalServiceDuration());
//        System.out.println(islamicMinistryService.getTotalServicePrice());
//        islamicMinistryService.performHajj();
//
//        System.out.println(buddhistMinistryService.getServices());
//        System.out.println(buddhistMinistryService.getTotalServiceDuration());
//        System.out.println(buddhistMinistryService.getTotalServicePrice());
//        buddhistMinistryService.performMeditation();


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