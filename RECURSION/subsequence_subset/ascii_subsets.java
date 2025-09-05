package RECURSION.subsequence_subset;

import java.util.ArrayList;

public class ascii_subsets {
    static ArrayList<String> subset_generate(String up, String p)
    {
        if(up.isEmpty())
        {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        ArrayList<String> left= subset_generate(up.substring(1),p+up.charAt(0));
        ArrayList<String> right = subset_generate(up.substring(1),p);
        ArrayList<String> ascii = subset_generate(up.substring(1),p= (String)p+(int)up.charAt(0));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }

    public static void main(String[] args) {
        System.out.println(subset_generate("aab",""));
    }
}
