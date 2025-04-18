class Box {
    double width, height, depth;


    Box() {
        width = height = depth = 0;
        System.out.println("Default constructor called.");
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        System.out.println("Parameterized constructor called.");
    }


    double volume() {
        return width * height * depth;
    }

    void displayVolume() {
        System.out.println("Volume: " + volume());
    }


    void displayVolume(String label) {
        System.out.println(label + ": " + volume());
    }


    protected void finalize () {
        System.out.println("Box object is destroyed (finalize called).");
    }
}

public class Box1 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.displayVolume();

        Box b2 = new Box(10, 5, 2);
        b2.displayVolume("Box b2");


        b1 = null;
        b2 = null;
        System.gc();

        System.out.println("Main method ends.");
    }
}
