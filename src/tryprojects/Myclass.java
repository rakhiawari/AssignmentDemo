package tryprojects;

public class Myclass {
    public static void main(String[] args) {
        int n=4;
        int temp=3;
        for (int i=1;i<=n;i++) {
            for (int k=temp;k>=1;k--) {
                System.out.print(" ");
            }
            temp--;
            for (int j=1;j<=i;j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
