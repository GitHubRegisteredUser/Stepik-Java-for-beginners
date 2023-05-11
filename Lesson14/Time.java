package Lesson14;

public class Time {

    static void t1() {
        Outer:
        for (int hour = 0; hour < 6; hour++) {
            Middle:
            for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break Outer;
                }
                Inner:
                for (int second = 0; second <= 59; second++) {
                    if (hour * second > minute) {
                        continue Middle;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        t1();
    }

}
