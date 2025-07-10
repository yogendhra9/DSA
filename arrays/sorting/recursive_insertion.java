package arrays.sorting;

public class recursive_insertion {
    static void recursiveInsertion(int arr[],int index)
    {
       if(index == 0)
       {
        return; // b.c , when we reach the last element.
       }
       else{
          
        int j=index;
        recursiveInsertion(arr, index-1); // recursive call to sort the rest of the array.
        while(j>0 && arr[j]<arr[j-1])
        {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--; // This is the most vital part where we are tracking the position of the element to be in the right place by moving it left.
        }
        
       }
    }
    public static void main(String[] args) {
        int arr[] = {9, 14, 15, 12, 6, 8, 13};
        recursiveInsertion(arr, arr.length-1);
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
