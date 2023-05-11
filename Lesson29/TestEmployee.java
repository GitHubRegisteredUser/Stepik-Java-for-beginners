package Lesson29;

import java.util.ArrayList;
import java.util.function.*;

public class TestEmployee {

    void printEmployee(Employee e) {
        System.out.println(e.name + " " + e.department + " " + e.salary);
    }

    void filtraciyaRabotnikov(ArrayList<Employee> Emp, Predicate<Employee> t) {
        for (Employee e : Emp) {
            if (t.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee("Evgeniy", "IT", 250000);
        Employee e2 = new Employee("Ivan", "notIT", 60000);
        Employee e3 = new Employee("Vasiliy", "IT", 500000);
        Employee e4 = new Employee("Mariya", "IT", 300000);
        Employee e5 = new Employee("Anna", "notIT", 40000);
        Employee e6 = new Employee("Nikolay", "notIT", 50000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);

        TestEmployee te = new TestEmployee();

        te.filtraciyaRabotnikov(list, (Employee e) -> {
            return e.department.equals("IT") && e.salary > 200000;
        });
        System.out.println("------------------------------------------------------------------------");
        te.filtraciyaRabotnikov(list, (Employee e) -> {
            return e.name.startsWith("E") && e.salary != 450000;
        });
        System.out.println("------------------------------------------------------------------------");
        te.filtraciyaRabotnikov(list, (Employee e) -> {
            return e.name.equals(e.department);
        });

    }

}

class Employee {

    String name;
    String department;
    double salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

}
