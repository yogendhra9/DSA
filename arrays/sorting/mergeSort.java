package arrays.sorting;

import java.util.ArrayList;

public class mergeSort {
    static void mergesort(int arr[],int low,int high)
    {
        if(low>=high)
        {
           return; // base case,this happens when the array has only one element..
        }
        else{
            int mid = low+(high-low)/2;
            mergesort(arr, low, mid);  // sorting the left half of the array
            mergesort(arr, mid+1, high); // sorting the right half of the array
            merge(arr,low,mid,high);
        }
    }
    static void merge(int arr[],int low,int mid,int high)
    {

        int left = low;
        int right = mid+1;
       ArrayList <Integer> temp = new ArrayList<>();
       while(left<=mid && right <=high)
       {
        if(arr[left]<=arr[right])
        {
            temp.add(arr[left]);
            left++;

        }
        else {
            temp.add(arr[right]);
            right++;
        }
       }
       while(left<=mid)
       {
        temp.add(arr[left]);
        left++;
       }
         while(right<=high)
         {
          temp.add(arr[right]);
          right++;
         }
         for(int i=low;i<=high;i++)
         {
          arr[i]=temp.get(i-low);
         }

    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        mergesort(arr, 0, n - 1);
        System.out.println("Sorted array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
