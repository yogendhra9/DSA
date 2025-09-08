package RECURSION.medium.subsequence_subset;
import java.util.*;

public class combination_sum2 {
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates,target,temp,result,0,true);
        return result;
    }
    static void helper(int[] candidates, int target,List<Integer> temp,List<List<Integer>> result,int index,boolean prev_included)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        if(index>=candidates.length)
        {
            return;

        }
        if(target<0)
        {
            return;
        }
        if(index>0 && !prev_included && candidates[index]== candidates[index-1])
        {
            helper(candidates,target,temp,result,index+1,false);
        }
        else
        {
            temp.add(candidates[index]);
            helper(candidates,target-candidates[index],temp,result,index+1,true);
            temp.remove(temp.size()-1);
            helper(candidates,target,temp,result,index+1,false);
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        Arrays.sort(nums);
        System.out.println(combinationSum2(nums,8));
    }
}
