package org.ies.zoo.components.scanner;

import org.ies.zoo.components.reader.ReaderAnimal;
import org.ies.zoo.model.animal.Carnivorous;

import java.util.Scanner;

public class ScannerCarnivorousReader implements ReaderAnimal<Carnivorous> {
    private final Scanner scanner;

    public ScannerCarnivorousReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Carnivorous read (){
        System.out.println("Especie:");
        String specie = scanner.nextLine();
        System.out.println("Edad");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nombre:");
        String name = scanner.nextLine();
        System.out.println("Que tipo de carne comen");
        String typeOfMeat = scanner.nextLine();

        return new Carnivorous(
                specie,
                age,
                name,
                typeOfMeat
        );
    }
}
