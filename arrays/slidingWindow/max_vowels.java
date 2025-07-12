package arrays.slidingWindow;
import java.util.HashMap;
import java.util.Map;

public class max_vowels {
     static int maxVowels(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('e', 2);
        map.put('i', 3);
        map.put('o', 4);
        map.put('u', 5);
        int left = 0;
        int cnt = 0;
        int max_cnt = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                cnt++;
            }
            while(right-left+1>k)
            {
                    char c1 = s.charAt(left);
                    if(map.containsKey(c1))
                        cnt--;
                    left++;
            }
            max_cnt = Math.max(cnt, max_cnt);

        }
        return max_cnt;
    }
    public static void main(String[] args)
    {
        String s = "abciiidef";
        int k =3;
        int max_cnt = maxVowels(s,k);
        System.out.println(max_cnt);
    }
}
