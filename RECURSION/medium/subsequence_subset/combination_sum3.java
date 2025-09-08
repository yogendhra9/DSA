package RECURSION.medium.subsequence_subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum3 {

    static List<List<Integer>> combinationSum3(int[] candidates, int target,int count) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
//       int  max_count =count;
        helper(candidates,target,temp,result,0,count);
        return result;
    }
    static void helper(int[] candidates, int target,List<Integer> temp,List<List<Integer>> result,int index,int count)
    {
        if(target==0 && count ==0)
        {
            result.add(new ArrayList<>(temp));

            return;
        }
        if(target<0) return;
        if(index>=candidates.length || count<0)
        {
            return;

        }
        if(target>0)
        {
            temp.add(candidates[index]);
            helper(candidates,target-candidates[index],temp,result,index+1,count-1);
            temp.remove(temp.size()-1);

            helper(candidates,target,temp,result,index+1,count);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(combinationSum3(nums,4,1 ));
    }
}
