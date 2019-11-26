package training.generics;

 public class DemoGenerics {

    public static void main(String[] args) {

        Test<String,Integer> obj1= new Test<>("Nam",30);
        Test<Integer,Integer> obj2= new Test<>(10,11);
        obj1.print();
        obj2.print();
    }
}

class Test<T,S>{

    private T a;
    private S b;

    public Test(T a, S b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println(a);
        System.out.println(b);
    }
}
