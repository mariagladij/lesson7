package ua.hillel.qaauto;

public class Employee {
    //instance variables
    String name;
    String jobTitle;
    int experience;
    double salary;

    // Constructors
    Employee() {
        name = "John Doe";
        jobTitle = "Intern";
        experience = 0;
        salary = 300;
    }

    Employee(String name, String jobTitle, int experience, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.experience = experience;
        this.salary = salary;
    }

    Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.experience = 0;
        this.salary = 300;
    }

    Employee(Employee employee) {
        name = employee.name;
        jobTitle = employee.jobTitle;
        salary = employee.salary;
        experience = employee.experience;
    }



    //Methods, methods overloading
    void calculateSalary() {
        System.out.println("Employee " + name + " has updated salary " + (salary + salary * experience / 100));
    }

    double calculateSalary(double salary, int experience) {
        return salary + salary * experience / 100;
    }

    double calculateSalary(double salary) {
        return salary + 500;
    }


    double calculateSalarySum() {
        return salary + salary * experience / 100;
    }

    void updateEmployeeData(String newName, String newTitle, int updatedExperience, double newSalary) {
        name = newName;
        jobTitle = newTitle;
        experience = updatedExperience;
        salary = newSalary;
    }


    boolean equalTo(Employee empl) {
        if (empl.salary == salary && empl.experience == experience)
            return true;
        else
            return false;
    }
    // ------

}