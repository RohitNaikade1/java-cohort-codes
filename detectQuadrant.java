import java.util.*;

public class detectQuadrant {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a=s1.nextInt();
        int b=s1.nextInt();

        if(a>0 && b>0){
            System.out.println("Lies in first quadrant!");
        }else if(a<0 && b>0){
            System.out.println("Lies in second quadrant!");
        }else if(a<0 && b<0){
            System.out.println("Lies in third quadrant!");
        }else{
            System.out.println("Lies in fourth quadrant!");
        }
    }
}
