package arrays.slidingWindow;

import java.util.HashMap;

public class k_uniques {
  static   int longest(String s ,int  k){
           int left =0;
           int right =0;
           int maxlen = -1;
           HashMap<Character,Integer> map = new HashMap<>();
          while(right<s.length())
           {
               char c = s.charAt(right);
              map.put(c,map.getOrDefault(c,0)+1);
              while(map.size()>k && left<right)
              {
                  char c1= s.charAt(left);
                  map.put(c1,map.get(c1)-1);
                  if(map.get(c1) ==0)
                      map.remove(c1);
                  left++;
              }
              if(map.size()==k) maxlen = Math.max(right-left+1,maxlen);
              right++;

           }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "cabacbebebe";
        int k = 3;
        int longest = longest(s,k);
        System.out.println(longest);


    }
}