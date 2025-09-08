package RECURSION.medium.subsequence_subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates_in_subsets {
    static void subset_creation(int[] nums, ArrayList<Integer> temp, List<List<Integer>> result, int index,boolean previous_included)
    {
       if(index>=nums.length)
       {
           result.add(new ArrayList<>(temp));
           return;
       }
       if(index>0 && !previous_included && nums[index]== nums[index-1])
       {
           subset_creation(nums,temp,result,index+1,false);
       }
       else {
           temp.add(nums[index]);
           subset_creation(nums,temp,result,index+1,true);
           temp.remove((temp.size()-1));
           subset_creation(nums,temp,result,index+1,false);
       }

    }
    public static void main(String[] args) {
        int [] num = {1,2,2};

        ArrayList<Integer> temporary = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
       subset_creation(num,temporary,result,0,true);
        System.out.println(result);
    }


}
