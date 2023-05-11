package Lesson8;

public class Second {

    public static void main(String[] args) {
        NotSecond NS1 = new NotSecond();
        NS1.PlKr(3);
        NotSecond.DlOkr(5);
        NS1.ShowInfo(4);
    }

}

class NotSecond {

    final static double Pi = 3.14;

    double PlKr(double r1) {
        double pl = Pi * r1 * r1;
        return pl;
    }

    static double DlOkr(double r2) {
        double dl = 2 * Pi * r2;
        return dl;
    }

    void ShowInfo(double r3) {
        System.out.println("Радиус: " + r3);
        System.out.println("Площадь круга: " + PlKr(r3));
        System.out.println("Длина окружности: " + DlOkr(r3));
    }

}
