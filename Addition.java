public class Addition {

    static byte num1;
    static short num2;
    static int num3;
    static long num4;
    static float num5;
    static double num6;
    static boolean num7;
    static char num8;

    public static void main(String[] args) {
        
        System.out.println("Default Values:");
        System.out.println("Byte: "+num1);
        System.out.println("Short: "+num2);
        System.out.println("Integer: "+num3);
        System.out.println("Long: "+num4);

        System.out.println("Float: "+num5);
        System.out.println("Double: "+num6);
        System.out.println("Boolean: "+num7);
        System.out.println("Char: "+num8);

        num1=34;
        num2=456;
        num3=53654;
        num4=7657657;
        num5=5.6f;
        num6=65.87;
        num7=true;
        num8='t';

        System.out.println("Modified Values:");
        System.out.println("Byte: "+num1);
        System.out.println("Short: "+num2);
        System.out.println("Integer: "+num3);
        System.out.println("Long: "+num4);

        System.out.println("Float: "+num5);
        System.out.println("Double: "+num6);
        System.out.println("Boolean: "+num7);
        System.out.println("Char: "+num8);

    }
}
