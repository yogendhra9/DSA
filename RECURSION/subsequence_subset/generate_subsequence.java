package RECURSION.subsequence_subset;

import java.util.ArrayList;
import java.util.HashSet;

public class generate_subsequence {
//
//static ArrayList<String> arr = new ArrayList<>();
//static void subset_generate(String up,String p)
//    {
//        if(up.isEmpty())
//        {
//            arr.add(p);
//            return ;
//
//        }
//
//         subset_generate(up.substring(1),p+up.charAt(0));
//        subset_generate(up.substring(1),p);
//
//        //return subset_generate(up.substring(1),p,arr);
//
//    }
//
//    public static void main(String[] args) {
//        String up = "abc";
//        String p = "";
//        subset_generate(up,p);
//        System.out.println(arr);
//    }
    static HashSet<String> subset_generate(String up,String p,int length)
    {
        if(up.isEmpty())
        {
            HashSet<String> arr = new HashSet<>();
            arr.add(p);
            return arr;
        }
        HashSet<String> left= subset_generate(up.substring(1),p+up.charAt(0),length+1);
        HashSet<String> right = subset_generate(up.substring(1),p,length);

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {

       ArrayList<String> set = new ArrayList<>((subset_generate("abb", "",0)));
        System.out.println(set);
    }

}
