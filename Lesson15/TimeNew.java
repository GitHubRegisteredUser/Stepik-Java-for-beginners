package Lesson15;

public class TimeNew {

    static void t2() {
        int hour = 0;
        Outer:
        while (hour < 6) {
            int minute = -1;
            Middle:
            do {
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                    break Outer;
                }
                int second = 0;
                Inner:
                while (second < 60) {
                    if (second * hour > minute) {
                        continue Middle;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
            } while (minute < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        t2();
    }

}
