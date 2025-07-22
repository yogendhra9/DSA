package Strings.conceptual;


import java.util.ArrayList;
import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
       String s = "  hello world  ";
       String s1 = "";
        String[] arr = s.split("\\s+");
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--)
        {
           if(arr[i].equals(" ")) continue;
           else
           {
               s1+=arr[i];
               if(i!=0) s1+= " ";
           }

        }
        System.out.println(s1);

    }

}
