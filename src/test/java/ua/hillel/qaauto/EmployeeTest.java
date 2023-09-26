package ua.hillel.qaauto;

import org.testng.annotations.Test;

public class EmployeeTest {
    @Test
    public void createNewEmployee(){
        Employee employee1 = new Employee(); //create an object of class Employee (this call the constructor)

        employee1.name = "John Wick";
        employee1.jobTitle = "QA engineer";
        employee1.experience = 1;
        employee1.salary = 1000.0;

        double salaryRase = employee1.salary + employee1.salary * employee1.experience/100;

        System.out.println("After promotion employee " + employee1.name + " has salary = " + salaryRase );


        Employee employee2;
        employee2 = employee1;
        employee2.experience = 8;

        System.out.println(employee1.experience);


    }
}
