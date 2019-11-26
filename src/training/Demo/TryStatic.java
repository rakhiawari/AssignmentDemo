package training.Demo;

public class TryStatic {
    static int value = 999;

    public static void disp() {

        System.out.println("This is display method!");
    }

    public static void main(String[] args) {

        System.out.println(value);

        TryStatic obj = new TryStatic();

        System.out.println(obj.value);
        System.out.println(TryStatic.value);

        disp();
        obj.disp();
        TryStatic.disp();

    }
}
