package training.Demo;


class Aclass {

    void display() {
        System.out.println("This is a display method of Aclass");
    }
}

class Bclass extends Aclass {

    void show() {

        System.out.println("This is a show method of Bclass");
    }
}

class Cclass extends Aclass {

    void dis() {
        System.out.println("this is a dis method of Cclass!");
    }
}
public class Base {

    public static void main(String[] args) {

        Bclass obj1 = new Bclass();     //Object of Composite class.
        obj1.show();                    //calling its own member
        obj1.display();                 //calling super class member

        Cclass obj2 = new Cclass();
        obj2.dis();
        obj2.display();
    }

}
