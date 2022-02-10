import java.util.*;

public class GCDUsingLoop {
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=s1.nextInt();
        System.out.println("Enter second number: ");
        int num2=s1.nextInt();

        int small=Math.min(num1,num2);
        int gcd=0;

        for(int i=1;i<=small;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }

        System.out.println("GCD is: "+gcd);
    }
}
