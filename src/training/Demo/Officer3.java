package training.Demo;

public class Officer3 extends Derived{

    void Display() {

        System.out.println("This is a Derived class.");

    }

    public static void main(String[] args) {

        System.out.println("This is a main class!");
        Officer3 obj = new Officer3();
        obj.Display();

    }
}

class Derived {

    void Display() {

        System.out.println("This is a Derived class.");

    }
}