import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int num=s1.nextInt();
        int temp=0;
        int original=num;
        while(num!=0){
            int digit=num%10;
            temp=temp+(digit*digit*digit);
            num/=10;
        }

        System.out.println(original==temp);
    }
}
