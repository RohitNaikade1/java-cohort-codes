import java.util.Scanner;

public class countChars {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str=s1.next();

        int upper=0,lower=0,digit=0;
        int len=str.length();
        for(int i=0;i<len;i++) {
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                digit=digit+1;
            }else if(Character.isUpperCase(ch)){
                upper=upper+1;
            }else if(Character.isLowerCase(ch)){
                lower=lower+1;
            }
        }

        System.out.println("Uppercase Letters: "+upper);
        System.out.println("Lowercase Letters: "+lower);
        System.out.println("Digits: "+digit);
    }
}
