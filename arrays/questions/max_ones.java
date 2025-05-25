package arrays.questions;

public class max_ones {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1};
        int count=0;
        int count1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            } else if (arr[i]==0) {
                continue;
            }
            if(count>count1)
            {
                count1=count;
            }
        }
        System.out.println(count1);
    }
}
