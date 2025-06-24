class Animal {
    void makeSound() {
        System.out.println("Animal sound");
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

class Cow extends Animal {
    void makeSound() {
        System.out.println("Moo");
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.makeSound();
        a = new Cat();
        a.makeSound();
        a = new Cow();
        a.makeSound();
    }
}
