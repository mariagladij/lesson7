package ua.hillel.qaauto;

import org.testng.annotations.Test;

public class PersonExample {
    @Test
    public void createNewPerson(){
        Person person1 = new Person();

        person1.name = "Maria";
        person1.age = 100;

        System.out.println("New person name is " + person1.name + " and age is " + person1.age);

    }
}
