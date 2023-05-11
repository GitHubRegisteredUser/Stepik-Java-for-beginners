package Lesson17;

public class SBTest {

    static boolean equality(StringBuilder a, StringBuilder b) {
        boolean result = true;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123 test");
        StringBuilder sb2 = new StringBuilder("123 test");
        StringBuilder sb3 = new StringBuilder("123 Test");
        boolean b1 = SBTest.equality(sb1, sb2);
        boolean b2 = SBTest.equality(sb1, sb3);
        System.out.println(b1);
        System.out.println(b2);
    }

}
