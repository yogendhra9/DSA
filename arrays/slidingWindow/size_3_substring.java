package arrays.slidingWindow;

import java.util.HashSet;

public class size_3_substring {
    static int countGoodSubstrings(String s) {
        int left = 0;
        int count = 0;

        for(int right=0;right<s.length();right++)
        {
           if(right-left+1==3)
           {
               HashSet<Character> set = new HashSet<>();
               set.add(s.charAt(left));
               set.add(s.charAt(left+1));
               set.add(s.charAt(left+2));

           if(set.size() == 3) count++;
           }
           left++;

        }
        return count;
    }

    public static void main(String[] args) {
        String s = "xyzzaz";
        int number = countGoodSubstrings(s);
        System.out.println(number);
    }
}
