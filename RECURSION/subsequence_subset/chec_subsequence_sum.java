package RECURSION.subsequence_subset;

public class chec_subsequence_sum {
    static boolean check_subsum(int [] nums,int k,int sum,int index) {
        if (sum == k) {
            return true;
        }
        if (index >= nums.length) {
            return false;
        }
        if(sum>k)
        {
            return check_subsum(nums, k, sum , index + 1) ;
        }
        else {
            return check_subsum(nums,k,sum+nums[index],index+1)||check_subsum(nums,k,sum,index+1)  ;

        }
    }
    public static void main(String[] args) {
        int [] nums = {4,3,9,2};
        int k = 8;
        System.out.println(check_subsum(nums,k,0,0));

    }

    }

