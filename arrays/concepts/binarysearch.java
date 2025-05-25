package arrays.concepts;

public class binarysearch {
    public static void main(String[] args) {
        int target = 7;
        int[] arr = {1,2,3,4,5};
        boolean result  = binary(arr, target);
        System.out.println(result);

    }
        static boolean binary(int[] arr, int target)
        {
            int start=0;
            int end = arr.length-1;
            int mid=0;
            while(start<end)
            {
                 mid = start+end/2;
                if(target==mid)
                {
                   return true;
                }
                else if (target>mid)
                {
                    start = mid+1;
                    end =end;
                }
                else
                {
                    end = mid-1
                    ;
                    start = start;
                }

            }
            return false;

        }
}
