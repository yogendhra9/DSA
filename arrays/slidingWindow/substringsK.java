package arrays.slidingWindow;

import java.util.HashMap;

public class substringsK {
    public static void main(String[] args) {
        int k =0;
        String str = "abcd";
        HashMap <Character,Integer> map = new HashMap<>();
        int len=0; int maxlen=0;
        int l=0;
        for(int r = 0; r <str.length(); r++)
        {
            map.put(str.charAt(r),map.getOrDefault(str.charAt(r),0)+1);
//            if(k==0)
//            {
//                maxlen =0;
//            }
            if(map.size()>k)
            {
                map.put(str.charAt(l),map.get(str.charAt(l))-1);
                if(map.get(str.charAt(l))==0)
                    map.remove(str.charAt(l));
                l++;
            }
            if(map.size()<=k)
            {
                len = r-l+1;
                maxlen = Math.max(maxlen,len);

            }

        }
        System.out.println(maxlen);
    }
}
