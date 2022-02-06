package p1.Company.Employee;

public class Employee implements IEmployee {
    private String name;
    private String surname;
    private String position;
    private double salary;

    public Employee(String name, String surname, String position, double salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPosition() {
        return this.position;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public double getYearlySalary() {
        return 12 * this.salary;
    }
}
