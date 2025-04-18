
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void breed() {
        System.out.println("Dog breed: Labrador");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.sound();
        myDog.eat();
        myDog.breed();
    }
}
