package arrays.concepts;

public class smallestsubarraySum {
    public static void main(String[] args) {

    int[] arr ={2,3,4,5,6,9};
    int target = 9;
    int minLen = Integer.MAX_VALUE;
    int start=0;
    int sum=0;
    for(int end=0;end<arr.length;end++)
    {
        sum+=arr[end];
        while(sum>=target) {

            minLen = Math.min(minLen,end - start+1);
            sum=sum-arr[start];

            start++;


        }

    }
        System.out.println(minLen);

    }
}
