package Lesson7;

public class EmployeeTest {

    public static void main(String[] args) {

        //Employee emp1 = new Employee("Mariya", "Guseva", 20);
        Employee emp2 = new Employee(10, "Vasiliy", "Pupkin", 25);
        Employee emp3 = new Employee(15, "Petr", "Ivanov", 35, 100000, 5);

        //System.out.println(emp1.name + " ");
        //emp1.vyvodImeni();
        //System.out.println(emp1.surname + " ");
        //emp1.vyvodFamilii();
        //System.out.println(emp1.age + " ");
        //emp1.vyvodVozrasta();
        
        System.out.println(emp2.name + " ");
        emp2.vyvodImeni();
        System.out.println(emp2.surname + " ");
        emp2.vyvodFamilii();
        //System.out.println(emp2.age + " ");
        emp2.vyvodVozrasta();

        System.out.println(emp3.name + " ");
        emp3.vyvodImeni();
        System.out.println(emp3.surname + " ");
        emp3.vyvodFamilii();
        //System.out.println(emp3.age + " ");
        emp3.vyvodVozrasta();
    }

}
