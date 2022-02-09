import java.util.*;
import java.io.*;
public class personalInfo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your name: ");
        String name=br.readLine();
        System.out.println("Enter Your city: ");
        String city=br.readLine();
        System.out.println("Enter Hobby: ");
        String hobby=br.readLine();
        format(name,city,hobby);

        
    }

    private static void format(String name, String city, String hobby) {
        System.out.println("Name: "+name);
        System.out.println("city: "+city);
        System.out.println("hobby: "+hobby);
    }

    
}
