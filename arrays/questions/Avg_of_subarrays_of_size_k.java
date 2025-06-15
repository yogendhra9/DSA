package arrays.questions;

public class Avg_of_subarrays_of_size_k {

    public double[] averagesub(int arr[],int k)
    {
        double[] avgsubarr = new double[k];
        int l=0;
        int r=0;
        double sum=0;
        for(r=0;r<k;r++)
        {
            sum+=arr[r];
        }
        avgsubarr[0] = sum/k;
        while(r<arr.length)
        {
            sum = sum-arr[l];
            l++;
            r++;
            sum+=arr[r-1];
            avgsubarr[l]= sum/k;
        }

        return avgsubarr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k =5;
        Avg_of_subarrays_of_size_k avg = new Avg_of_subarrays_of_size_k();
        double[] avgarr = avg.averagesub(arr,k);
        for(int i=0;i<avgarr.length;i++)
        {
            System.out.println(avgarr[i]);
        }
    }
}
