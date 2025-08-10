package RECURSION.subsequence_subset;

import java.util.ArrayList;

public class generate_subsets {
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
    static ArrayList<String> subset_generate(String up,String p)
    {
        if(up.isEmpty())
        {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> left= subset_generate(up.substring(1),p+up.charAt(0));
        ArrayList<String> right = subset_generate(up.substring(1),p);
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {

        System.out.println(subset_generate("abcd", ""));
    }

}
