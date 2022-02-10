import java.util.Scanner;

public class printLowerTriangle {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter first matrix's row size:");
        int row1=s1.nextInt();
        System.out.println("Enter first matrix's column size:");
        int col1=s1.nextInt();

        int arr1[][]=new int[row1][col1];
        
        System.out.println("Enter first matrix's elements:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.println("Enter element:");
                arr1[i][j]=s1.nextInt();
            }
        }

        print(arr1);
     }

    private static void print(int[][] arr1) {

        System.out.println("Lower Triangle:");

        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<=i;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
