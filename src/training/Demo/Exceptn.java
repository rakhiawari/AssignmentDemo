package training.Demo;

public class Exceptn {

    private static Exceptn obj=new Exceptn();
    public static void main(String[] args) {
        int temp =obj.one();
        System.out.println(temp);
    }

    public int one() {
        System.out.println("this is one");
        return obj.two();
    }
    public int two() {
        int one=1;
        int zero=0;
        int five=5;
        System.out.println("this is two");
        try {
            /*int result=one/five;
            System.out.println("trying");
            return 5;*/
            int result = 5/0;
        }
        catch (ArithmeticException e) {
            System.out.println("DIVIDE BY ZERO");
            System.exit(0);
        }
        finally {
//            return 100;
            System.out.println("FINALLY BLOCK");
        }
        System.out.println("after finally");
        return 45;
    }
    public void three() {
        System.out.println("this is three");
    }
}
