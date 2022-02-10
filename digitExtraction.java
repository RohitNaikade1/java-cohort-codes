import java.util.Scanner;

public class digitExtraction {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int num=s1.nextInt();

        while(num>0){
            System.out.println(num%10);
            num=num/10;
        }
    }
}
