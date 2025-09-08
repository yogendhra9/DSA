package RECURSION.medium.subsequence_subset;
import java.util.*;
public class combination_sum {
    static List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates,target,temp,result,0);
        return result;
    }
    static void helper(int[] candidates, int target,List<Integer> temp,List<List<Integer>> result,int index)
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
        else
        {
            temp.add(candidates[index]);
            helper(candidates,target-candidates[index],temp,result,index);
            temp.remove(temp.size()-1);
            helper(candidates,target,temp,result,index+1);
        }
    }

    public static void main(String[] args) {
      int [] candidates = {2,3};
      int target = 6;
        System.out.println(combinationSum(candidates,target));
    }

}
