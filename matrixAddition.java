import java.util.Scanner;

public class matrixAddition {

    static void addition(int arr1[][],int arr2[][]){
        int addition[][]=new int[arr1.length][arr1[0].length];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                addition[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println("Addition of Two Matrices is: ");
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                System.out.print(addition[i][j]+" ");
            }
            System.out.println();
        }
    }
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

        int arr2[][]=new int[row1][col1];
        System.out.println("Enter second matrix's elements:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<row1;j++){
                System.out.println("Enter element:");
                arr2[i][j]=s1.nextInt();
            }
        }
        addition(arr1,arr2);
     }
}
