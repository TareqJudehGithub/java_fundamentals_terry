package model;

import java.time.LocalDate;

public class Pet {
    private String name;
    private String breed;
    private LocalDate dob;

    /* Constructors */

    public Pet() {

    }
    public Pet(String name, String breed, LocalDate dob) {
        this.name = name;
        this.breed = breed;
        this.dob = dob;
    }
    /* getters */
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public LocalDate getDob() {
        return dob;
    }
    /* setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    /* methods */
    @Override
    public String toString() {
        return "Pet {" +
                "Name: " + name + " \n" +
                "Breed: " + breed + "\n" +
                "Date of Birth: " + dob;
    }
}
