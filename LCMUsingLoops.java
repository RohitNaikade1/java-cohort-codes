import java.util.Scanner;

public class LCMUsingLoops {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=s1.nextInt();
        System.out.println("Enter second number: ");
        int num2=s1.nextInt();

        int small=Math.min(num1,num2);
        int lcm=0;

        while(true){
            if(small%num1==0 && small%num2==0){
                lcm=small;
                break;
            }
            small++;
        }

        System.out.println("LCM is: "+lcm);
    }
}
