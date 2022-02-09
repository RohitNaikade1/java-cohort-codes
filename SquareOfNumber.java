import java.util.*;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=s1.nextInt();
        System.out.println("Square of a "+num+" is: "+square(num));
    }

    private static int square(int num) {
        return num*num;
    }
}
