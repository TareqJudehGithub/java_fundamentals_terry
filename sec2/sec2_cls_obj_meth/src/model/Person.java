package model;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Address address;
    private Person spouse;
    private Pet pet;

    /* Constructor */
    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    /* Person Getter */
    public String getFirstName() {
        return firstName;
    }
    public String lastname() {
        return lastName;
    }
    public LocalDate getDob() {
        return dob;
    }

    /* Person Setters */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    /* spouse getters and setters */
    public Person getSpouse() {
        return spouse;
    }
    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
     /* Address class getters and setters */

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /* Pet getters and setters */
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    /* toString print class properties*/
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", spouse=" + spouse +
                ", pet=" + pet +
                '}';
    }
}
