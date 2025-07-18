package arrays.slidingWindow;

import java.util.HashMap;

public class longest_substring_atmost_k {
    static int longest(String s ,int  k) {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.size() > k) {
                char c1 = s.charAt(left);
                map.put(c1, map.get(c1) - 1);
                if (map.get(c1) == 0)
                    map.remove(c1);
                left++;
            }
             maxlen = Math.max(right - left + 1, maxlen);
            right++;

        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "aa";
        int k = 2;
        int longer = longest(s,k);
        System.out.println(longer);
    }
}
