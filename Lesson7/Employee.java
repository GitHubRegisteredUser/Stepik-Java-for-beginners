package Lesson7;

public class Employee {

    int id;
    String name;
    public String surname;
    private int age;
    double salary;
    int department;

    public Employee(int idcard, String imya, String familiya, int vozrast, double zarplata, int otdel) {
        id = idcard;
        name = imya;
        surname = familiya;
        age = vozrast;
        salary = zarplata;
        department = otdel;
    }

    Employee(int idcard1, String imya1, String familiya1, int vozrast1) {
        this(idcard1, imya1, familiya1, vozrast1, 0.0, 0);
    }

    private Employee(String imya2, String familiya2, int vozrast2) {
        this(0, imya2, familiya2, vozrast2, 0.0, 0);
    }

    public void vyvodImeni() {
        System.out.println("Name: " + name);
    }

    public void vyvodFamilii() {
        System.out.println("Surname: " + surname);
    }

    public void vyvodVozrasta() {
        System.out.println("Age: " + age);
    }

}
