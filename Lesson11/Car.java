package Lesson11;

public class Car {

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        CarTest c1 = new CarTest("black", "V6", 5);
        CarTest c2 = new CarTest("red", "V12", 3);

        c1.dcChange(7);
        ct.colorSwap(c1, c2);

        System.out.println("Информация о первой машине. " + "Цвет: " + c1.color + "," + " Двигатель: " + c1.engine + "," + " Кол-во дверей: " + c1.doorcount);
        System.out.println("Информация о второй машине. " + "Цвет: " + c2.color + "," + " Двигатель: " + c2.engine + "," + " Кол-во дверей: " + c2.doorcount);
    }

}

class CarTest {

    String color;
    String engine;
    int doorcount;

    CarTest(String color, String engine, int doorcount) {
        this.color = color;
        this.engine = engine;
        this.doorcount = doorcount;
    }

    CarTest() {

    }

    void dcChange(int a) {
        doorcount = a;
    }

    void colorSwap(CarTest x, CarTest y) {
        String color1 = x.color;
        x.color = y.color;
        y.color = color1;
    }

}
