package ua.hillel.qaauto;

import org.testng.annotations.Test;

public class EmployeeTest {

    @Test
    public void createNewEmployee() {
        Employee employee1 = new Employee();

        employee1.name = "John Wick";
        employee1.jobTitle = "QA engineer";
        employee1.experience = 1;
        employee1.salary = 1000.00;

        double salaryRaise = employee1.salary + employee1.salary * employee1.experience / 100;

        System.out.println("After promotion employee " + employee1.name + " has salary " + salaryRaise);

        Employee employee2;

        employee2 = employee1;

        employee2.experience = 8;

        System.out.println(employee1.experience);

//        employee2 = null;
//        System.out.println(employee1.experience);
//
//        System.out.println(employee2.experience);
        employee1 = new Employee();

        employee1.name = "Ron Green";
        employee1.jobTitle = "Engineer";
        employee1.experience = 10;
        employee1.salary = 5000.00;

        System.out.println(employee1.name);
    }

    @Test
    public void checkMethod() {
        Employee employee1 = new Employee();

//        employee1.name = "Ron Green";
//        employee1.jobTitle = "Engineer";
//        employee1.experience = 10;
//        employee1.salary = 5000.00;
//
//       // employee1.calculateSalary();
//        System.out.println(employee1.calculateSalarySum());
//        System.out.println("");
//
//        double result = employee1.calculateSalarySum();

        employee1.updateEmployeeData("Anna Frank", "BA", 12, 3500);
        System.out.println();
    }


    @Test
    public void checkConstructor() {
        Employee employee1 = new Employee();

        System.out.println(employee1.name);

        Employee employee2 = new Employee("Harry Potter", "magician", 20, 70000.00);

        System.out.println(employee2.name);


    }

    // Garbage collector
    @Test
    public void checkOverloading() {
        Employee employee1 = new Employee("Harry Potter", "magician", 20, 2000.00);

        employee1.calculateSalary();

        System.out.println(employee1.calculateSalary(employee1.salary, employee1.experience));

        int num = 14;
        double salary = employee1.calculateSalary(num);

        System.out.println(salary);
    }

    @Test
    public void compareEmployees() {
        Employee employee1 = new Employee("Harry Potter", "magician", 20, 2000.00);
        Employee employee2 = new Employee("Filth", "not-magician", 40, 500.00);
        Employee employee3 = new Employee("Luna", "magician", 20, 2000.00);

        System.out.println(employee1.equalTo(employee2));
        System.out.println(employee1.equalTo(employee3));

    }

    @Test
    public void copyEmpl() {
        Employee employee1 = new Employee("Luna", "magician", 20, 2000.00);
        Employee employee2 = new Employee(employee1);

        System.out.println("before");
        System.out.println(employee1.name);
        System.out.println(employee2.name);

        employee2.name = "Ron";

        System.out.println("after");
        System.out.println(employee1.name);
        System.out.println(employee2.name);

    }
}