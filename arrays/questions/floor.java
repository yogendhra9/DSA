package arrays.questions;

public class floor {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,6,8};
        int target =0 ;
        int result = floor(arr,target);
        System.out.println(result);
    }
    static int floor(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        int mid=0;
        if(target<arr[start])
        {
            return -1;
        }


        while(start<=end)
        {

            mid = start+(end-start)/2;
            if(target==arr[mid])
            {
                return arr[mid];
            } else if (target>arr[mid])

            {
                start=mid+1;

            }
            else if(target<arr[mid])
            {
                end = mid-1;

            }

        }
        return arr[end];

    }

}
