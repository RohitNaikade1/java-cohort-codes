import java.util.*;
public class detectTriangle {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first side:");
        int f1=s1.nextInt();
        System.out.println("Enter second side:");
        int f2=s1.nextInt();
        System.out.println("Enter third side:");
        int f3=s1.nextInt();

        if(f1==f2 && f2==f3 && f1==f3){
            System.out.println("Equilateral triangle!");
        }else if(f1!=f2 && f2!=f3 && f1!=f3){
            System.out.println("Scalene triangle!");
        }else{
            System.out.println("Isosceles triangle!");
        }
    }
}
