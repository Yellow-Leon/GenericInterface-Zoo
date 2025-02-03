package org.ies.zoo.components.scanner;

import org.ies.zoo.components.reader.ReaderAnimal;
import org.ies.zoo.model.animal.Animal;
import org.ies.zoo.model.animal.Carnivorous;
import org.ies.zoo.model.animal.Herbivorous;

import java.util.Scanner;

public class ScannerAnimalReader implements ReaderAnimal<Animal> {
    private final Scanner scanner;
    private final ReaderAnimal<Carnivorous> carnivorousReaderAnimal;
    private final ReaderAnimal<Herbivorous> herbivorousReaderAnimal;

    public ScannerAnimalReader(Scanner scanner, ReaderAnimal<Carnivorous> carnivorousReaderAnimal, ReaderAnimal<Herbivorous> herbivorousReaderAnimal) {
        this.scanner = scanner;
        this.carnivorousReaderAnimal = carnivorousReaderAnimal;
        this.herbivorousReaderAnimal = herbivorousReaderAnimal;
    }

    public Animal read() {
        int option;
        do {
            System.out.println("Que tipo de animal es");
            System.out.println("1. Carnivoro");
            System.out.println("2. Herbivoro");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                return carnivorousReaderAnimal.read();
            } else if (option == 2) {
                return herbivorousReaderAnimal.read();
            } else {
                System.out.println("Error");
            }
        } while (option != 3);

        return null;
    }
}
