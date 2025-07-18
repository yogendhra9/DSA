package arrays.slidingWindow;

public class longest_subarray_sum {
    static int longest_subarray(int []arr,int k)
    {
    int left =0;
    int sum =0;
    int maxlen =Integer.MIN_VALUE;
    for(int right=0;right<arr.length;right++)
    {
       sum+=arr[right];
       while(sum>k)
       {
           sum-=arr[left];
           left++;
       }
       maxlen = Math.max(maxlen,right-left+1);

    }
    return maxlen == Integer.MIN_VALUE ? 0 : maxlen;
    }

    public static void main(String[] args) {
        int [] arr ={10, 5, 2, 7, 1,};
        int k = 15;
        int max  = longest_subarray(arr,k);
        System.out.println(max);
        
    }
}
