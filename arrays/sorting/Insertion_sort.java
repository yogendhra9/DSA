package arrays.sorting;

public class Insertion_sort {
    static int[] insertion(int [] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
           int j =i;
           while(j>0 && arr[j]<arr[j-1])
           {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
           } 
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {9,14,15,12,6,8,13};
        int[] sorted_arr = insertion(arr);
        System.out.print("Sorted array: ");
        for (int i = 0; i < sorted_arr.length; i++) {
            System.out.print(sorted_arr[i] + " ");
        }
    }
    
}
