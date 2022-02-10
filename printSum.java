import java.util.Scanner;

public class printSum {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int sum=1;
        String add="1";
        for(int i=2;i<=10;i++){
            sum=sum+i;
            add+="+"+String.valueOf(i);
            System.out.println(sum+" ("+add+")");
        }
        sum=1;
        add="1";
        int i=2;
        while(sum<=100){
            sum=sum+i;
            add+="+"+String.valueOf(i);
            i++;
        }

        System.out.println(sum+" ("+add+")");

    }
}
