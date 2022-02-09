import java.util.*;
public class detectGrade {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter chemistry marks:");
        int chem=s1.nextInt();
        System.out.println("Enter physics marks:");
        int phy=s1.nextInt();
        System.out.println("Enter maths marks:");
        int maths=s1.nextInt();

        int total=(phy+chem+maths)/3;

        if(total>90){
            System.out.println("Grade-A");
        }else if(total>80 && total<=90){
            System.out.println("Grade-B");
        }else if(total>70 && total<=80){
            System.out.println("Grade-C");
        }else if(total>60 && total<=70){
            System.out.println("Grade-D");
        }else{
            System.out.println("Fail");
        }
    }
}
