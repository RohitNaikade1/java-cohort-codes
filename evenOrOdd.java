import java.util.*;
public class evenOrOdd {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=s1.nextInt();
        check(num);
    }

    private static void check(int num) {
        if(num%2==0){
            System.out.println("Number is even!");
        }else{
            System.out.println("Number is odd!");
        }
    }
}
