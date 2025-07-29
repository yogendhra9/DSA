package RECURSION.easy;

public class recursive_bubble_sort {
    static void bubble_sort(int arr[],int index)
    {
        if(index < 0) //
        {

            return;
        }
        else
        {
            for(int i=0;i<index;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            bubble_sort(arr, index-1); // recursive call 
        }

     
    }
    public static void main(String[] args) {
        int arr[] = {336,42,12,6543,123,112345683,0,1};
      bubble_sort(arr, arr.length-1);
        System.out.println("The sorted array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
