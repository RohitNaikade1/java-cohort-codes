import java.util.Scanner;

public class matrixMultiplication {
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

        System.out.println("Enter second matrix's row size:");
        int row2=s1.nextInt();
        System.out.println("Enter second matrix's column size:");
        int col2=s1.nextInt();
        int arr2[][]=new int[row2][col2];
        System.out.println("Enter second matrix's elements:");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.println("Enter element:");
                arr2[i][j]=s1.nextInt();
            }
        }

        multiplication(arr1,arr2);
     }
    private static void multiplication(int[][] arr1, int[][] arr2) {

        int result[][]=new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
                    
            }
        }

        System.out.println("multiplication of Two Matrices is: ");
        
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
