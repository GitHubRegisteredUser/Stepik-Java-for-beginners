package Lesson6;

public class Overloaded {

    public static void main(String[] args) {
        Overload Over = new Overload();
        Over.sum();
        Over.sum(1);
        Over.sum(1, 2);
        Over.sum(1, 2, 3);
        Over.sum(1, 2, 3, 4);
    }

}

class Overload {

    void sum() {
        int result = 0;
        System.out.println("Сумма всех чисел: " + result);
    }

    void sum(int a) {
        int result1 = a;
        System.out.println("Сумма всех чисел: " + result1);
    }

    void sum(int a, int b) {
        int result2 = a + b;
        System.out.println("Сумма всех чисел: " + result2);
    }

    void sum(int a, int b, int c) {
        int result3 = a + b + c;
        System.out.println("Сумма всех чисел: " + result3);
    }

    void sum(int a, int b, int c, int d) {
        int result4 = a + b + c + d;
        System.out.println("Сумма всех чисел: " + result4);
    }

}
