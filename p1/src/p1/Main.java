package p1;

import p1.Company.Company;
import p1.Company.Employee.Employee;


public class Main {

    public static void main(String[] args) {
        Company company = new Company();

        Employee employee = company.createEmployee(
                "John",
                "Doe",
                "MANAGER",
                1245.45
        );

        company.printEmployee(employee);
    }
}
