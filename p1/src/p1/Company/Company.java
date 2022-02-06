package p1.Company;


import p1.Company.Employee.Employee;

public class Company {

    public Employee createEmployee(String name, String surname, String position, double salary) {
        Employee employee = new Employee(
                name,
                surname,
                position,
                salary
        );
        return employee;
    }

    public void printEmployee(Employee employee) {
        System.out.println(employee.getFullName());
    }
}
