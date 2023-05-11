package Lesson8;

public class First {

    public static void main(String[] args) {
        NotFirst2.MD2(11, 5);
        System.out.println(NotFirst1.MD1(2, 3, 4));
    }

}

class NotFirst2 {

    static void MD2(int e, int d) {
        int div = e / d;
        int ost = e % d;
        System.out.println("Результат деления: " + div + ", остаток: " + ost);
    }

}

class NotFirst1 {

    static int MD1(int a, int b, int c) {
        int mult = a * b * c;
        return mult;
    }

}
