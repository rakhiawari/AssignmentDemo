package training.Programs;

class Test
{
    public static void display()
    {
        System.out.println("Hello 1");
    }
}
public class Demo extends Test
{
    public static void display()
    {
        // super.display();         // raises compilation error
        System.out.println("Hello 2");
    }
    public static void main(String args[])
    {
        display();
        Test.display();
    }
}