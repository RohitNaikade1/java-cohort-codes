import java.util.Arrays;
import java.util.Scanner;

public class smallerAndLargerFromArray {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = s1.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element: ");
            arr[i] = s1.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Largest Number: " + arr[arr.length - 1]);
        System.out.println("Smallest Number: " + arr[0]);
    }
}
