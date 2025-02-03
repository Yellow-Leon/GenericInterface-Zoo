package org.ies.zoo.model;

import org.ies.zoo.model.animal.Animal;

import java.util.Arrays;
import java.util.Objects;

public class fenced {
    private int fencedNumber;
    private Animal[] animals;

    public fenced(int fencedNumber, Animal[] animals) {
        this.fencedNumber = fencedNumber;
        this.animals = animals;
    }

    public int getFencedNumber() {
        return fencedNumber;
    }

    public void setFencedNumber(int fencedNumber) {
        this.fencedNumber = fencedNumber;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        fenced fenced = (fenced) o;
        return fencedNumber == fenced.fencedNumber && Objects.deepEquals(animals, fenced.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fencedNumber, Arrays.hashCode(animals));
    }

    @Override
    public String toString() {
        return "fenced{" +
                "fencedNumber=" + fencedNumber +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}