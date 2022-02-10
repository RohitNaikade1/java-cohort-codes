import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primeAndArmstrong {

    static boolean prime(int num){
        if(num==1){
            return false;
        }
        boolean flag=true;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                flag=false;
            }
        }

        return flag;
    }

    static boolean armstrong(int num){
        int temp=0;
        int original=num;
        while(num!=0){
            int digit=num%10;
            temp=temp+(digit*digit*digit);
            num/=10;
        }

       return original==temp;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        List prime=new ArrayList();
        List armstrong=new ArrayList();

        System.out.println("Enter number: ");
        int num=s1.nextInt();
        for(int i=1;i<=num;i++){
            if(prime(i)){
                prime.add(i);
            }else if(armstrong(i)){
                armstrong.add(i);
            }
        }

        System.out.println("Prime Numbers: "+prime);
        System.out.println("Armstrong Numbers: "+armstrong);
    }
}
