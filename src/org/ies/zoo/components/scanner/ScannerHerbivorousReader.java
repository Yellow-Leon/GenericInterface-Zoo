package org.ies.zoo.components.scanner;

import org.ies.zoo.components.reader.ReaderAnimal;
import org.ies.zoo.model.animal.Herbivorous;

import java.util.Scanner;

public class ScannerHerbivorousReader implements ReaderAnimal<Herbivorous> {
    private final Scanner scanner;

    public ScannerHerbivorousReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Herbivorous read (){
        System.out.println("Especie:");
        String specie = scanner.nextLine();
        System.out.println("Edad");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nombre:");
        String name = scanner.nextLine();
        System.out.println("Que tipo de carne comen");
        String typeOfVegetation = scanner.nextLine();

        return new Herbivorous(
                specie,
                age,
                name,
                typeOfVegetation
        );
    }
}
