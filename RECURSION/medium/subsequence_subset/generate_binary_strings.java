package RECURSION.medium.subsequence_subset;
import java.util.*;

public class generate_binary_strings {
    static List<String> generate_strings(int n)
    {
      ArrayList<String> list = new ArrayList<>();
        helper(n,"",list);
        return list;

    }
//
//    static ArrayList<String>  helper(int n, String number_seq)
//    {
//
//      if(number_seq.length() == n)
//      {
//          ArrayList<String> list = new ArrayList<>();
//          list.add(number_seq);
//          return list;
//      }
//
//      ArrayList<String> right = new ArrayList<>();
//
//      if( number_seq.isEmpty() || number_seq.charAt(number_seq.length()-1)!= '1' )
//      {
//          right = helper(n,number_seq+'1');
//      }
//
//      ArrayList<String> left = helper(n,number_seq+'0');
//      left.addAll(right);
//      return left;
//    }

    //another easy method
    static ArrayList<String> lis = new ArrayList<>();
    static void helper(int n,String p,ArrayList<String> lis)
    {
        if(p.length() ==n)
        {
            lis.add(p);
            return;
        }
         helper(n,p+'0',lis);
        if(p.isEmpty() || p.charAt(p.length()-1)!='1')
        {
            helper(n,p+'1',lis);
        }
    }

    public static void main(String[] args) {
        System.out.println(generate_strings(3 ));
    }
}
