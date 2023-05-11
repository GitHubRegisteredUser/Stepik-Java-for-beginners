package Lesson5;

public class Employee {

    public static void main(String[] args) {
        EmployeeTest Jim = new EmployeeTest(1, "Jim", "Beam", 31, 50000, 1);
        EmployeeTest Jane = new EmployeeTest(2, "Jane", "Silver", 28, 30000, 2);

        Jim.uvelicheniyeZP(Jim);
        Jane.uvelicheniyeZP(Jane);
    }

}

class EmployeeTest {

    EmployeeTest(int idcard, String imya, String familiya, int vozrast, double zarplata, int otdel) {
        id = idcard;
        name = imya;
        surname = familiya;
        age = vozrast;
        salary = zarplata;
        department = otdel;
    }

    int id;
    String name;
    String surname;
    int age;
    double salary;
    int department;

    void uvelicheniyeZP(EmployeeTest e) {
        System.out.println("Zarplata " + e.name + " do povysheniya: " + salary);
        double raise = e.salary * 2;
        System.out.println("Zarplata " + e.name + " posle povysheniya: " + raise);
    }

}
