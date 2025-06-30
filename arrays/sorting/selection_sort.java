package arrays.sorting;

public class selection_sort {

    static int[] selection(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<=n-2;i++)
        {
            int min_ind=0;
            min_ind = min(arr,i);
          
          int  temp = arr[i];
           arr[i] = arr[min_ind];
           arr[min_ind]  = temp;

        }

        return arr;

    }
    static int min(int[] arr,int start)
    {
        int min_ind = -1;
       int min_elem = Integer.MAX_VALUE;
        for(int i = start;i<arr.length;i++)
        {
            if(arr[i]<min_elem)
            {
                min_elem = arr[i];
                min_ind = i;
            }
        }
        return min_ind;

    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 5, 6};
        int[] sorted_arr = selection(arr);
        System.out.print("Sorted array: ");
        for (int i = 0; i < sorted_arr.length; i++) {
            System.out.print(sorted_arr[i] + " ");
        }
    }

}
