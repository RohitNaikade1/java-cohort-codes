import java.util.*;

public class Calculator {

    static int addition(int num1, int num2) {
        return num1 + num2;
    }

    static int division(int num1, int num2) {
        return num1 / num2;
    }

    static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    static int substraction(int num1, int num2) {
        return num1 - num2;
    }

    static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("**********   CALCULATOR   ***********");
            System.out.println(
                    "1.Addition....\n2.Substraction...\n3.Multiplication...\n4.Division...\n5.Modulus...\n6.Exit...");
            System.out.println("Enter your choice:");
            int ch = s1.nextInt();
            int num1, num2;
            switch (ch) {
                case 1:
                    System.out.println("Enter first number:");
                    num1 = s1.nextInt();
                    System.out.println("Enter second number:");
                    num2 = s1.nextInt();
                    System.out.println("Addition: " + addition(num1, num2));
                    break;

                case 2:
                    System.out.println("Enter first number:");
                    num1 = s1.nextInt();
                    System.out.println("Enter second number:");
                    num2 = s1.nextInt();
                    System.out.println("Substraction: " + substraction(num1, num2));
                    break;

                case 3:
                    System.out.println("Enter first number:");
                    num1 = s1.nextInt();
                    System.out.println("Enter second number:");
                    num2 = s1.nextInt();
                    System.out.println("Multiplication: " + multiplication(num1, num2));
                    break;

                case 4:
                    System.out.println("Enter first number:");
                    num1 = s1.nextInt();
                    System.out.println("Enter second number:");
                    num2 = s1.nextInt();
                    System.out.println("Division: " + division(num1, num2));
                    break;

                case 5:
                    System.out.println("Enter first number:");
                    num1 = s1.nextInt();
                    System.out.println("Enter second number:");
                    num2 = s1.nextInt();
                    System.out.println("Remainder: " + modulus(num1, num2));
                    break;

                case 6:
                    System.out.println("Exited!");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    break;

            }
        }
    }
}
