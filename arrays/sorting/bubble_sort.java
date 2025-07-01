package arrays.sorting;


public class bubble_sort {
        public static void main(String[] args) {
        int[] arr = {-5, 2, 111, 3, 5, 6};
        for (int i = arr.length-1; i>0; i++) {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        } 
            System.out.println("The sorted array is:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
}
