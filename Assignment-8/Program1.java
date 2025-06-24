import java.util.*;

abstract class Animal {
    abstract void makeSound();
    void breathe() {
        System.out.println("Breathing...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.makeSound();
        a1.breathe();
        Animal a2 = new Cat();
        a2.makeSound();
        a2.breathe();
    }
}
