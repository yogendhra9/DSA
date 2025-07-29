package arrays.sorting;
public class quickSort {
    static void qs(int[] arr,int low,int high)
    {
        if(low >= high) {
            return; // Base case: if the array has one or no elements, it's already sorted
        }
       if(low<high)
       {
            int pivot =  pivot_index(arr,low,high);
            qs(arr,low,pivot-1);
            qs(arr,pivot+1,high);

        }
    }
    static int pivot_index(int[] arr,int low ,int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j)
        {
            while(arr[i] <=pivot && i<=high-1)
            {
                i++; // Increment i until we find an element greater than the pivot
            }
            while(arr[j]>pivot && j>=low+1)
            {
                j--; // Decrement j until we find an element less than or equal to the pivot
            }

            if(i<j)
            {
                // Swap elements at i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the pivot element with the element at index j
        int temp = arr[low];
        arr[low] = arr[j];  
        arr[j] = temp;
       return j;
    }

    public static void main(String [] args)
    {
        int[] arr = {5,2,3,1};
        int n = arr.length;
        qs(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
