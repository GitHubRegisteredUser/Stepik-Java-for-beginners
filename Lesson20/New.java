package Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class New {

    ArrayList<String> abc(String... s) {
        ArrayList<String> aL = new ArrayList<>();
        for (String s1 : s) {
            if (!aL.contains(s1)) {
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        New L20 = new New();
        L20.abc("privet", "ok", "poka", "privet", "kak dela?", "ok", "hello");
    }

}
