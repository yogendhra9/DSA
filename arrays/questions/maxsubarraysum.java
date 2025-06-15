package arrays.questions;

public class maxsubarraysum {
    public int maxsum(int [] arr, int k)
    {
        int sum=0;
        int maxlen=0;
        int l=0;
        int r=0;
       for(r=0;r<arr.length;r++)
        {
            sum+=arr[r];
            if(sum<=k)
            {
                maxlen= Math.max(maxlen,r-l+1);


            }
            while(sum>k)
            {
                sum-=arr[l];
                l++;
            }
        }
        return maxlen;
    }
        public static void main(String[] args) {
            int[] arr = {2,1,2,3,1,1,4};
            int k = 7;
            maxsubarraysum obj = new maxsubarraysum();
            int result = obj.maxsum(arr,k);
            System.out.println(result);
        }
}
