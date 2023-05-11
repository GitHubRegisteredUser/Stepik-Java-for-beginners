package Lesson27;

public class Lesson27 {

    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.eat("мясо");
        try {
            t1.drink("вода");
            try {
                t1.drink("пиво");
            } catch (NeVodaException n) {
                System.out.println(n.getMessage());
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            } finally {
                System.out.println("это inner finally блок");
            }
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
        }
    }

}

class NeMyasoException extends RuntimeException {

    NeMyasoException(String s) {
        super(s);
    }

}

class NeVodaException extends Exception {

    NeVodaException(String s) {
        super(s);
    }

}

class Tiger {

    void eat(String s) {
        if (!s.equals("мясо")) {
            throw new NeMyasoException("тигр не ест " + s);
        } else if (s.equals("мясо")) {
            System.out.println("тигр ест мясо");
        }
    }

    void drink(String s) throws NeVodaException {
        if (!s.equals("вода")) {
            throw new NeVodaException("тигр не пьет " + s);
        } else if (s.equals("вода")) {
            System.out.println("тигр пьет воду");
        }
    }

}
