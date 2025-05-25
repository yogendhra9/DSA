package arrays.questions;
//return the smallest num that is >= target
public class smallestLetter {
    public static void main(String[] args) {
        String[] arr = {"c","f","j"};
        String target = "a";
        String result = smallest(arr,target);
        System.out.println(result);
    }
    static String smallest(String[] arr, String target)
    {
        int start = 0;
        int end = arr.length-1;
        int mid=0;
        if(target.compareTo(arr[end]) > 0)
        {
            return arr[0];
        }

        while(start<end)
        {

            mid = start+(end-start)/2;

            if(target==arr[mid])
            {
                return arr[mid];
            } else if (target.compareTo(arr[mid]) > 0)

            {
                start=mid+1;

            }
            else if(target.compareTo(arr[mid]) < 0)
            {
                end = mid-1;

            }

        }
        return arr[start];

    }

}
