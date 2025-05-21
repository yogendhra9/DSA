package arrays.searching;

public class linear {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6};
        int target = 12;
        int res = linear_search(arr, target);
        System.out.println(res);
    }

    //    static boolean linear_search(int[] arr , int target)
//    {
//        for(int n:arr)
//        {
//            if(n == target)
//            {
//                return true;
//            }
//
//        }
//        return false;
//
//    }
    //another approach
    static int linear_search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        else {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == target)
                {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }



}

