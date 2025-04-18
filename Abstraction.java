
abstract class Animal {

    abstract void makeSound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.eat();
    }
}
