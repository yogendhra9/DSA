package arrays.questions;

public class max_min
{
    static int max(int[] arr)

    {
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;


    }
    static int min(int[] arr)
    {
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min =arr[i];
            }
        }
        return min;
    }
    static int second_max(int[] arr)
    {
        int max = max(arr);
        int second_max = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=max && arr[i]>second_max)
            {
                second_max = arr[i];

            }
        }
        return second_max;
    }
    static int second_min(int[] arr)
    {
        int min = min(arr);
        int second_min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=min && arr[i]<second_min)
            {
                second_min = arr[i];
            }
        }
        return second_min;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(second_max(arr));
        System.out.println(second_min(arr));



    }
}
