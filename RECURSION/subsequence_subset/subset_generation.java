package RECURSION.subsequence_subset;

import java.util.ArrayList;
import java.util.List;

public class subset_generation {

    static void subset_generate(int index, ArrayList<Integer> temp ,int [] nums,List<List<Integer>> result)
    {
      if(index>=nums.length)
      {
          result.add(new ArrayList<>(temp));
          return;
      }
      temp.add(nums[index]);
      subset_generate(index+1,temp,nums,result);
      temp.remove(temp.size()-1);

      subset_generate(index+1,temp,nums,result);
    }

    public static void main(String[] args) {
        int [] num = {1,2,3};

        System.out.println(subset_create(num));
    }
    static List<List<Integer>> subset_create(int[] nums)
    {
        ArrayList<Integer> temporary = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        subset_generate(0,temporary,nums,result);
        return result;
    }

}
