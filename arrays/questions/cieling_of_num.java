package arrays.questions;
//return the smallest num that is >= target
public class cieling_of_num {
    public static void main(String[] args) {
    int[] arr = {1,2,2,4,6,8};
    int target =5 ;
    int result = cieling_of_num(arr,target);
    System.out.println(result);
    }
    static int cieling_of_num(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        int mid=0;
        if(target>arr[end])
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
        return arr[start];

    }

}
