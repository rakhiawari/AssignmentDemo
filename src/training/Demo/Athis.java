package training.Demo;

import java.io.FileNotFoundException;

public class Athis {

    public Athis() {

        System.out.println("This is a default constructor!");
    }

    public Athis(int x) {
        this();
        System.out.println("Single parameter constructor: " + x);
    }

    public Athis(int x, int y) {
        this(10);
        System.out.println("Double parameter constructor: " + (x + y));
    }

    public static void main(String[] args) {
        Athis obj = new Athis(2, 3);
    }
}

//DONE.