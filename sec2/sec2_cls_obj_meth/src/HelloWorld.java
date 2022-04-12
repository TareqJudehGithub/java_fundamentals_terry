import model.Dog;
import model.Person;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /* Instances */

    Person tom = new Person("Tom", "Willings", LocalDate.of(1975, 6, 27));
    Person sarah = new Person("Sarah", "Adams", LocalDate.of(1984, 4, 15));

    tom.setSpouse(sarah);

    Dog spike = new Dog("Spike", "Pug", LocalDate.of(2020, 5, 13));
    spike.bark();
    tom.setPet(spike);

    System.out.println(tom);
    }
}
