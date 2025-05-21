package arrays.concepts;
import java.util.Scanner;
import java.util.Arrays;

public class primitives {
    public static void main(String[] args) {
       String[] str = new String[4];
       
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<str.length;i++)
       {
        str[i]=sc.next();
       }
         for(int i=0;i<str.length;i++)
         {
          System.out.print(str[i]+" ");
         }
        String new_str = Arrays.toString(str);
        System.out.println(new_str);

    }
    
}
