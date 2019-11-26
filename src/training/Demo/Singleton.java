package training.Demo;

public class Singleton {

    public static void main(String[] args) {
        Sub x = Sub.getInstance();
        Sub y = Sub.getInstance();

        x.s = (x.s).toLowerCase();
        System.out.println("X: "+x.s);
        System.out.println("Y: "+y.s);

        x.s = (x.s).toUpperCase();
        System.out.println("X: "+x.s);
        System.out.println("Y: "+y.s);
    }


}

class Sub {

    private static Sub single_instance = null;
    public String s;
    private Sub() {
            s = "This is a STRING!";
    }
    public static Sub getInstance() {
        if(single_instance == null) {
            single_instance = new Sub();
        }
        return  single_instance;
    }

}
