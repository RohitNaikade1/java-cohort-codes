import java.util.*;

public class acceptUntilQ {
    public static void main(String[] args) {
        
        Scanner s1=new Scanner(System.in);

        int cnt=0;
        char ch='\u0000';

        while(ch!='q'){
            cnt++;
            System.out.println("Want to Quit?(q): ");
            ch=s1.next().charAt(0);
        }

        System.out.println("Count: "+cnt);
    }
}
