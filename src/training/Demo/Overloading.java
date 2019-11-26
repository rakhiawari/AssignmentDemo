package training.Demo;

public class Overloading {


    public void cal() {

        System.out.println("This is the first method!");
    }

    public void cal(int a, int b, int c) {

        int sum = a + b + c;

        System.out.println(sum);
    }

    public void cal(String name) {

        System.out.println("This is a third method: " + name);
    }

    public static void main(String[] args) {

        Overloading obj = new Overloading();

        obj.cal();
        obj.cal(4, 5, 7);
        obj.cal("eat");

    }
}
