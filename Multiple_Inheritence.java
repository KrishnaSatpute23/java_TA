
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

interface Pet {
    void play();
}

class BabyDog extends Animal implements Pet {
    void weep() {
        System.out.println("Baby dog is weeping");
    }

    public void play() {
        System.out.println("Baby dog is playing");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        BabyDog baby = new BabyDog();

        baby.eat();
        baby.play();
        baby.weep();
    }
}
