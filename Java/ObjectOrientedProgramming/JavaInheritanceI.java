package Java.ObjectOrientedProgramming;

public class JavaInheritanceI {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

/* For Java 7 and Java 8, just add the Bird class. */
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}