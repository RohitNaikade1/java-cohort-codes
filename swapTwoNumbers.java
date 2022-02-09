import java.util.*;
public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=s1.nextInt();
        System.out.println("Enter second number: ");
        int num2=s1.nextInt();
        swap(num1,num2);
    }

    private static void swap(int num1,int num2) {
        int temp=0;
        System.out.println("Numbers before swap: ");
        System.out.println("Number 1: "+num1);
        System.out.println("Numbers 2: "+num2);

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("Numbers after swap: ");
        System.out.println("Number 1: "+num1);
        System.out.println("Numbers 2: "+num2);
    }
}
