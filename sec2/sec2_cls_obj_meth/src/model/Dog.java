package model;

import java.time.LocalDate;

public class Dog extends Pet{
    public Dog() {
    }

    public Dog(String name, String breed, LocalDate dob) {
        super(name, breed, dob);
    }

    /*methods (behaviours) */
    public void bark() {
        System.out.println("Ruff Woof Woof!");
    }
}
