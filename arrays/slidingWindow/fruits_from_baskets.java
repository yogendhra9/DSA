package arrays.slidingWindow;

import java.util.HashMap;

public class fruits_from_baskets {
    static int totalfruit(int[] fruits)
    {
        int left =0;
        int right =0;
        int maxlen =-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(right<fruits.length)
        {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while (map.size() > 2 && left < right) {

                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0)
                    map.remove(fruits[left]);
                left++;
            }
           maxlen = Math.max(right-left+1,maxlen);
            right++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,2,2};
        int max_len = totalfruit(arr);
        System.out.println(max_len);
    }
}
