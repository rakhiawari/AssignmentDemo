package training.Demo;

public class Objects {

    void add(int a, int b) {
        int c = a+b;
        System.out.printf("\nresult: " + c);
    }
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, CloneNotSupportedException {

        Objects obj = new Objects();                                                    //1
        obj.add(4,5);

     /*   Objects obj1 = (Objects) Class.forName("/home/rakhi/IdeaProjects/Assignments/src/Demo/Objects.java").newInstance();            //2
        obj1.add(2,1); */


        Objects obj3 = (Objects) obj.clone();                                           //3
        obj3.add(1,1);

        /*FileInputStream file = new FileInputStream(filename);                         //4
        ObjectInputStream in = new ObjectInputStream(file);
        Object obj = in.readObject();*/
    }
}

/*

package Demo;

public class Astatic {

    static int value = 1_00_000;

    public static void display() {

        System.out.println("This is display() method!");
    }

    public static void main(String[] args) {

        System.out.println(display);

    }
}



 */