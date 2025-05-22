package arrays.questions;

import java.util.Arrays;

public class richest {
    public static void main(String[] args) {
     int[][] arr = {{1,2,3},{3,2,1}};
     int wealth= richPerson(arr);
        System.out.println(wealth);


    }
    static int richPerson(int[][] arr)
    {
        int[] richarr = new int[arr.length];
        int max_wealth = Integer. MIN_VALUE;




        for(int person=0; person<arr.length;person++)
        {
            int r_sum=0;
            for(int accounts=0;accounts<arr[person].length;accounts++)
            {

                r_sum+=arr[person][accounts];

            }
            if(r_sum>max_wealth)
            {
                max_wealth=r_sum;


            }
        }
        return max_wealth;

    }


}
