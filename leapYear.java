import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Year:");
        int year=s1.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap year!");
                }else{
                    System.out.println("Not a leap year!");
                }
            }else{
                System.out.println("leap year!");
            }
        }else{
            System.out.println("Not a leap year!");
        }
    }
}
