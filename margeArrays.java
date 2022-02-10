import java.util.Arrays;
import java.util.Scanner;

public class margeArrays {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter first array size: ");
        int size1=s1.nextInt();
        int arr1[]=new int[size1];
        for(int i=0; i<size1; i++){
            System.out.println("Enter element: ");
            arr1[i]=s1.nextInt();
        }

        System.out.println("Enter second array size: ");
        int size2=s1.nextInt();
        int arr2[]=new int[size2];
        for(int i=0; i<size2; i++){
            System.out.println("Enter element: ");
            arr2[i]=s1.nextInt();
        }

        int answer[]=new int[size1+size2];

        for(int i=0; i<size1; i++){
           answer[i]=arr1[i];
        }
        for(int i=0; i<size2; i++){
            answer[i+(size1-1)]=arr2[i];
         }

         Arrays.sort(answer);

         System.out.println("Merged Array: ");
         int size3=answer.length;
         for(int i=0; i<size3; i++){
             System.out.print(answer[i]+" ");
         }

       
    }
}
