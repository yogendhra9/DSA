package arrays.slidingWindow.HardQues;

import java.util.HashMap;

public class min_window_sub {

static String minWindow(String s ,String t)
{
    if(s.length()<t.length())
    {
        return " ";
    }
    HashMap<Character,Integer> map = new HashMap<>();
    for (int i = 0; i < t.length(); i++) {
        map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);

    }
    int left =0; int right =0; int count =0;
    int minlen= Integer.MAX_VALUE;
    int minstart =0;
    HashMap<Character,Integer> current = new HashMap<>();
    for(right=0;right<s.length();right++)
    {
        char c = s.charAt(right);
        current.put(c,current.getOrDefault(c,0)+1);
        if(map.containsKey(c) && current.get(c) <= map.get(c))
        {
            count++;
            System.out.println(count);
        }
        while(count == t.length()) {
            if (right - left + 1 < minlen) {
                minlen = right - left + 1;
                minstart = left;

            }
            char c1 = s.charAt(left);
            current.put(c1, current.get(c1) - 1);
            if (map.containsKey(c1) &&current.get(c1)<map.get(c1)) {
                count--;
                System.out.println(count);
            }
            left++;
        }
    }
    return minlen == Integer.MAX_VALUE ? "" : s.substring(minstart,minstart+minlen);

}

    public static void main(String[] args) {
        String s = "adobecodebanc";
        String t = "abc";
        String sub = minWindow(s,t);
        System.out.println(sub);
    }
}
