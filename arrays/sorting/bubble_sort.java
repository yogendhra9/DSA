package arrays.sorting;


public class bubble_sort {
        public static void main(String[] args) {
        int[] arr = {2,4,3,5,1,2};
        for (int i = arr.length-1; i>=0; i--) {
            int swapped = 0;
            for(int j=0;j<=i-1;j++)
            {
                
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = 1;
                }
               
            }
             if(swapped ==0)
                {
                    break; // If no elements were swapped, the array is sorted
                }
        } 
            System.out.println("The sorted array is:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
}
