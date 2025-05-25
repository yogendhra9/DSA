package arrays.concepts;
//The pattern here is sliding window , the size of the subarray is fixed
public class max_subarray_of_size_k {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;
        int maxSum=0;
        int window_sum=0;
        for(int i=0;i<k;i++)
        {
            window_sum+=nums[i];

        }
        maxSum = window_sum;
        for(int i = k;i<nums.length;i++)
        {
            window_sum+=nums[i]-nums[i-k];  //the most important condition
            maxSum=Math.max(maxSum,window_sum);
        }
        System.out.println("the maximum sum of a subarray of size " +k+ " is:"+ maxSum);
    }
}
