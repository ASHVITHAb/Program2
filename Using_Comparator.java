//Employee Class
public class Employee {

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}
//Main Class

import java.util.*;

public class EmployeeSort {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Ash", 50000));
        employees.add(new Employee(2, "Ram", 70000));
        employees.add(new Employee(3, "John", 60000));

        employees.sort((e1, e2) ->
                Double.compare(e1.salary, e2.salary));

        System.out.println(employees);
    }
}
