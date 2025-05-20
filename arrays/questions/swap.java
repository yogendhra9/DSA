package arrays.questions;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {12,43,4,54,543};
        swap(arr,3,4);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr,int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
