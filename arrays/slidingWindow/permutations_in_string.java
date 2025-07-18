package arrays.slidingWindow;

import java.util.HashMap;

public class permutations_in_string {
    static int checkInclusion(String s1,String s2)
    {
        int left =0;

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int right =0;right<s2.length();right++)
        {
            char c = s2.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            while(right-left+1>s1.length())
            {
                char c1 = s2.charAt(left);
                map.put(c1,map.get(c1)-1);
                if(map.get(c1))
            }
        }
    }
}
