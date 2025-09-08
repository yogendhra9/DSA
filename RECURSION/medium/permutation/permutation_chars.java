package RECURSION.medium.permutation;

import java.util.ArrayList;
import java.util.List;

public class permutation_chars {
    public static void main(String[] args) {
        System.out.println(permutation("","abc"));
    }
    static ArrayList<String> permutation(String p, String up)
    {
            if(up.isEmpty())
            {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;

            }
        char ch = up.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<=p.length();i++)
        {
          String first = p.substring(0,i);
          String last =  p.substring(i,p.length());
         list.addAll(permutation(first+ch+last,up.substring(1)));
        }
        return list;
    }

}
