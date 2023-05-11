package Lesson22;

public class Animal {

    public static void main(String[] args) {

    }

    int eyes;

    Animal() {
        System.out.println("I am an animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }

}

class Pet extends Animal {

    String name;
    int tail = 1;
    int paw = 4;

    Pet() {
        System.out.println("I am a pet");
        eyes = 2;
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }

}

class Dog extends Pet {

    Dog(String name) {
        this.name = name;
        System.out.println("I am a dog and my name is: " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }

}

class Cat extends Pet {

    Cat(String name) {
        this.name = name;
        System.out.println("I am a cat and my name is: " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }

}

class Test {

    public static void main(String[] args) {
        Dog d1 = new Dog("Buddy");
        System.out.println("Количество лап у собаки: " + d1.paw);
        Cat c1 = new Cat("Fluffy");
        c1.sleep();
    }

}
