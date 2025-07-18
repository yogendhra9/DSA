package arrays.slidingWindow;

import java.util.HashMap;

public class longest_substring {
    static int longest(String S)
    {
        int maxlen=0;
        int left =0;
        HashMap<Character,Integer>  map = new HashMap<>();
        for(int right=0;right<S.length();right++)
        {
            char c = S.charAt(right);

            if(map.containsKey(c) && left<=map.get(c) )
            {
               left = map.get(c)+1;
            }
            map.put(c,right);
            maxlen = Math.max(right-left+1,maxlen);

        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s  = "geeksforgeeks";
        int longest = longest(s);
        System.out.println(longest);
    }
}
