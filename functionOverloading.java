import java.util.Scanner;

public class functionOverloading {

    static void addition(int num1, int num2) {
        System.out.println("Addition: "+(num1 + num2));
    }
    static void addition(int num1, int num2,int num3) {
        System.out.println("Addition: "+(num1 + num2+num3));
    }
    static void division(int num1, int num2) {
        System.out.println("Division: "+(num1 / num2));
    }

    static void multiplication(int num1, int num2,int num3) {
        System.out.println("Multiplication: "+(num1 * num2*num3));
    }
    static void multiplication(int num1, int num2) {
        System.out.println("Multiplication: "+(num1 * num2));
    }
    static void substraction(int num1, int num2) {
        System.out.println("Substraction: "+(num1 - num2));
    }
    static void substraction(int num1, int num2,int num3) {
        System.out.println("Substraction: "+(num1 - num2 - num3));
    }

    static void modulus(int num1, int num2) {
        System.out.println("Modulus: "+(num1 % num2));
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        addition(10,20);
        addition(10,20,30);
        multiplication(10, 20);
        multiplication(10, 20 ,30);
        division(10,5);
        substraction(100,70);
        substraction(100,70,5);
        modulus(4,2);
    }
}
