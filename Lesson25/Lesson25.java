package Lesson25;

public class Lesson25 {

    public static void main(String[] args) {

        Animal a1 = new Mechenosets("Fishy");
        Animal a2 = new Pingvin("Pin");
        Animal a3 = new Lev("Lyova");

        Fish f1 = new Mechenosets("Fishy2");
        Bird b1 = new Pingvin("Pin2");
        Mammal m1 = new Lev("Lyova2");

        Mechenosets ms1 = new Mechenosets("Fishy3");
        Pingvin p1 = new Pingvin("Pin3");
        Lev l1 = new Lev("Lyova3");

        speakable s1 = new Pingvin("Pin4");
        speakable s2 = new Lev("Lyova4");

        Animal[] array1 = {a1, a2, a3, f1, b1, m1, ms1, p1, l1};
        speakable[] array2 = new speakable[]{s1, s2, b1, m1, p1, l1};

        for (Animal a : array1) {
            if (a instanceof Mechenosets) {
                Mechenosets m = (Mechenosets) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("------------------------------");
        }
        for (speakable s : array2) {
            if (s instanceof Pingvin) {
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (s instanceof Lev) {
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("------------------------------");
        }

    }

}

abstract class Animal {

    Animal(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();

}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    void sleep() {
        System.out.println("Всегда интересно наблюдать, как спят рыбы");
    }

    abstract void swim();

}

class Mechenosets extends Fish {

    Mechenosets(String name) {
        super(name);
        this.name = name;
    }

    void swim() {
        System.out.println("Меченосец - это красивая рыба, которая быстро плавает!");
    }

    void eat() {
        System.out.println("Меченосец не хищная рыба, и она ест обычный рыбий корм!");
    }

}

abstract class Bird extends Animal implements speakable {

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speak() {
        System.out.println(name + "sings");
    }

}

class Pingvin extends Bird {

    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    void eat() {
        System.out.println("Пингвин любит есть рыбу!");
    }

    void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу!");
    }

    void fly() {
        System.out.println("Пингвины не умеют летать!");
    }

    public void speak() {
        System.out.println("Пингвины не умеют петь как соловьи!");
    }

}

abstract class Mammal extends Animal implements speakable {

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();

}

class Lev extends Mammal {

    Lev(String name) {
        super(name);
        this.name = name;
    }

    void eat() {
        System.out.println("Лев, как любой хищник, любит мясо!");
    }

    void sleep() {
        System.out.println("Большую часть дня лев спит!");
    }

    void run() {
        System.out.println("Лев - это не самая быстрая кошка!");
    }

}

interface speakable {

    default void speak() {
        System.out.println("somebody speaks");
    }

}
