import java.util.*;
public class smallestAndLargest {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num1=s1.nextInt();
        int num2=s1.nextInt();
        int num3=s1.nextInt();

        int small,largest;
        if(num1 > num2 && num1>num3){
            largest = num1;
            if(num2>num3){
                small =num3;
            }else{
                small = num2;
            }
        }else if(num2 > num1 && num2>num3){
            largest = num2;
            if(num1>num3){
                small =num1;
            }else{
                small = num3;
            }
        }else{
            largest = num3;
            if(num1>num2){
                small =num2;
            }else{
                small = num1;
            }
        }

        System.out.println("Small Number: " + small);
        System.out.println("Large Number: " + largest);
    }
}
