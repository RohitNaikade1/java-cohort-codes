import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        int space=7;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            space=space-2;
            System.out.println();
        }
    }
}
