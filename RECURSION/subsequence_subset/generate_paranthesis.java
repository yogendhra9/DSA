package RECURSION.subsequence_subset;

import java.util.ArrayList;

public class generate_paranthesis {
    static ArrayList<String> generate_para(int n)
    {
        ArrayList<String> lis = new ArrayList<>();
        helper(n,"(",lis,1,0);
        return lis;
    }
    static ArrayList<String> sub  = new ArrayList<>();
    static void helper(int n,String braces , ArrayList<String> sub,int open,int close)
    {
        if(braces.length() == n*2)
        {
            sub.add(braces);
            return;
        }
        char c1 = '(';
        char c2 = ')';
        if(open<n)
        {
            helper(n,braces+c1,sub,open+1,close);


        }
        if (close<open) {
            helper(n,braces+c2,sub,open,close+1);
        }





    }

    public static void main(String[] args) {
        System.out.println(generate_para(2));
    }
}
