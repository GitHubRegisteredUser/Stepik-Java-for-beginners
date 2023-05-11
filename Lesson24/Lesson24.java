package Lesson24;

public class Lesson24 {

    public static void main(String[] args) {

        Mechenosets m = new Mechenosets("Fishy");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();

        speakable s = new Pingvin("Pin");
        //s.eat();
        //s.sleep();
        //s.fly();
        s.speak();

        Animal a = new Lev("Lyovushka");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        //a.run();
        //a.speak();

        Mammal ml = new Lev("Leonid");
        System.out.println(ml.name);
        ml.eat();
        ml.sleep();
        ml.run();
        ml.speak();

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
