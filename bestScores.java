import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bestScores {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        Integer arr[]=new Integer[10];
        System.out.println("Enter Array elements: ");

        for(int i=0;i<10;i++){
            System.out.println("Enter Element: ");
            arr[i] = s1.nextInt();
            arr[i]+=1;
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }
    }
}
