package arrays.slidingWindow;

public class smallest_subarray_size_k {
     static int smallestSubWithSum(int x, int[] arr) {
         int sum = 0;
         int min_len = Integer.MAX_VALUE;
         int left = 0;
         int len = 0;

         for (int right = 0; right < arr.length; right++) {
             if (sum <= x) {
                 sum += arr[right];
                 //   len++;
             }
             while (sum >= x) {
                 sum -= arr[left];
                 min_len = Math.min(right-left+1,min_len);
                 left++;
             }
         }
         return min_len==Integer.MAX_VALUE ? 0:min_len;
     }

    public static void main(String[] args) {
        int [] arr = {1,4,45,6,0,19};
        int x =51;
        int min_len = smallestSubWithSum(x,arr);
        System.out.println(min_len);
    }
}
