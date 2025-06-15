package arrays.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class vowel_count
{
public static void main(String[] args) {
    String str = "abciiidef";
    int k = 3;
    int l=0; int r=0;
    List<Integer> vowel_count = new ArrayList<>();
       for(r=0;r<str.length();r++) {
        if(r-l+1==k)
        {
              int vowels= 0;
             for(int i=l;i<=r;i++) {

                char c1 = str.charAt(i);
                if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
                {
                    vowels++;
                }

            }
            vowel_count.add(vowels);
                l++;

        }
    }
    System.out.println(vowel_count);
}
}
