package arrays.questions;

public class check_sort {
    static boolean check_sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if (arr[i]>arr[i+1])
            {
                return false;

            }



        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5};
        boolean result = check_sort(arr);
        System.out.println(result);


    }
}
