package RECURSION.medium.subsequence_subset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subset_sum1 {
    static List<Integer> subsetSums(int[] nums) {
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums,0,result,temp,0);
        Collections.sort(result);
        return result;
    }
    static void helper(int [] nums,int index,List<Integer> result ,List<Integer> temp,int sum)
    {
        if(index>=nums.length)
        {
            if(temp.isEmpty())
            {
                result.add(0);
                return;
            }
            else {
                result.add(sum);
                sum=0;
                return;
            }
        }
        temp.add(nums[index]);
        sum = sum+nums[index];
        helper(nums,index+1,result,temp,sum);
        temp.remove(temp.size()-1);
        sum =sum-nums[index];
        helper(nums,index+1,result,temp,sum);
    }

    public static void main(String[] args) {
        int [] nums  = {5,2,1};
        System.out.println(subsetSums(nums));
    }

}
