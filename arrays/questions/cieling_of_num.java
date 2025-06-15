package arrays.questions;
//return the smallest num that is >= target
public class cieling_of_num {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,8,8,10};
        int target = 8;
        int result = cieling_of_num(arr, target);
        int upper= upper_bound(arr,target);
        cieling_of_num lower = new cieling_of_num();
        int lower_ans = lower.lower_bound(arr,target);
        System.out.println(lower_ans);
        System.out.println(upper);
        System.out.println(result);
        int[] ans = lower.first_last(arr,target);
        System.out.println(ans[0]+ " " + ans[1]);
    }

    static int cieling_of_num(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {

            mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            }

        }
        return arr[start];

    }

     static int upper_bound(int[] arr, int target)
    {
        int low=0;
        int high = arr.length-1;
        int mid=0;
        int ans =arr.length;
        while(low<=high)
        {
             mid =low+(high-low)/2;
            if(arr[mid]>target)
            {
                ans = mid;
                high = mid-1;
            }
            else {
              low= mid+1;
            }


        }
        return ans;
    }
     public  int lower_bound(int[] arr, int target)
    {
        int low=0;
        int high = arr.length-1;
        int mid=0;
        int ans = arr.length;
        while(low<= high)
        {
            mid = low+ (high-low) /2;
            if(arr[mid]>=target)
            {
                ans = mid;
                high = mid-1;

            }
            else {
                low =mid+1;

            }
        }
        return ans;
    }
    public int[] first_last(int[] arr, int target )
    {
        int lb = lower_bound(arr,target);


        if(lb==arr.length || arr[lb]!=target)
        {
            return new int[]{-1,-1};
        }
        else {
            return new int[]{lb,upper_bound(arr,target)-1};
        }
    }


}
