import java.util.*;
public class nAndM{
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter value of m: ");
        int m=s1.nextInt();
        int n=0;

        if(m>0){
            n=1;
        }else if(m==0){
            n=0;
        }else{
            n=-1;
        }


        System.out.println("value of n is: "+n);
    }
}