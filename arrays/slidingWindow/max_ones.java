package arrays.slidingWindow;

public class max_ones {
    static int longest_ones(int[] arr,int k) {
        int z_count = 0;
        int maxlen = Integer.MIN_VALUE;

        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) z_count++;

            while (z_count > k) {
                if (arr[left] == 0) z_count--;
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int [] arr ={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        int longest = longest_ones(arr,k);
        System.out.println(longest);
    }
}
