package arrays.questions;
import java.util.Arrays;


import java.util.*;


public class rev {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
             arr[i]=sc.nextInt();


        }
          rev1(arr,0,n-1);
         System.out.println(Arrays.toString(arr));

    }
    static void rev1(int[] arr,int start,int end)
    {
        if(start>end)
        {
            return;
        }
        else {
        int temp =arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
       rev1(arr, start+1, end-1);
        }
    }
}



