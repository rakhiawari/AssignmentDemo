package training.Demo;

/*class  Hello {

    public Hello() {

        System.out.println("Constructor of a hello class!");
    }
}

class Test extends Hello {

    public Test() {
        System.out.println("Constructor of a Test class!");
    }
}
public class AsubConst extends Test{

    public AsubConst() {

        System.out.println("Constructor of a AsubConst!");
    }

    public static void main(String[] args) {

        AsubConst obj = new AsubConst();
    }
}
//DONE.

 */

class Hello {
    public Hello() {

        System.out.println("DEFAULT Constructor of a Hello Class!");
    }
    public Hello(int x) {
        this();
        System.out.println("PARAMETRISED Constructor of a Hello class: "+x);
    }

}

public class AsubConst extends Hello{

    public AsubConst() {

        super(100);
        System.out.println("This is a default constructor of SUb class!");
    }

    public AsubConst(int x) {
        this();
        System.out.println("Single parameter constructor of subclass: "+ x);
    }
    public AsubConst(int x, int y) {
        this(10);
        System.out.println("Double parameter constructor of subclass: "+ (x+y));
    }

    public static void main(String[] args) {

        //AsubConst obj = new AsubConst(2,3);
        AsubConst obj1 = new AsubConst(5);

    }
}
