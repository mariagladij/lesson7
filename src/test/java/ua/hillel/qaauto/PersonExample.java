package ua.hillel.qaauto;

import org.testng.annotations.Test;

public class PersonExample {

    @Test
    public void createNewPerson() {
        Person person1 = new Person("Oleksandr", 20);

        System.out.println("First person name is " + person1.name + " and his age is " + person1.age);

        Person person2 = new Person("Federica", 30);

        System.out.println("Second person name is " + person2.name + " and her age is " + person2.age);

    }

}


