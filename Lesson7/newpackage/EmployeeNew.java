package Lesson7.newpackage;

public class EmployeeNew {

    public static void main(String[] args) {

        //Lesson7.Employee emp1 = new Lesson7.Employee("Mariya", "Guseva", 20);
        //Lesson7.Employee emp2 = new Lesson7.Employee(10, "Vasiliy", "Pupkin", 25);
        Lesson7.Employee emp3 = new Lesson7.Employee(15, "Petr", "Ivanov", 35, 100000, 5);

        //System.out.println(emp1.name + " ");
        //emp1.vyvodImeni();
        //System.out.println(emp1.surname + " ");
        //emp1.vyvodFamilii();
        //System.out.println(emp1.age + " ");
        //emp1.vyvodVozrasta();
        
        //System.out.println(emp2.name + " ");
        //emp2.vyvodImeni();
        //System.out.println(emp2.surname + " ");
        //emp2.vyvodFamilii();
        //System.out.println(emp2.age + " ");
        //emp2.vyvodVozrasta();
        
        //System.out.println(emp3.name + " ");
        emp3.vyvodImeni();
        System.out.println(emp3.surname + " ");
        emp3.vyvodFamilii();
        //System.out.println(emp3.age + " ");
        emp3.vyvodVozrasta();
    }

}
