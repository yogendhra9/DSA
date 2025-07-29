package arrays.questions;

public class ships_question_bs {
    static int shipWithinDays(int[] weights, int days) {
        int low = max(weights);
        int high = sum(weights);
        int mid=0;
        while(low<=high)
        {
            mid = low+ (high-low)/2;
            int day_count = count_days(weights,mid);
            if(day_count<=days)
            {
                high = mid-1;
            }
            else low = mid+1;

        }
        return low;
    }
   static int max(int [] weights)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<weights.length;i++)
        {
            max = Math.max(max,weights[i]);
        }
        return max;
    }
    static int sum(int [] weights)
    {
        int sum = -1;
        for(int i=0;i<weights.length;i++)
        {
            sum+=weights[i];
        }
        return sum;
    }
   static int count_days(int [] weights,int mid)
    {
        int load=0;
        int days=1;
        for(int i=0;i<weights.length;i++)
        {
            if(weights[i]+load>mid)
            {
                days++;
                load = weights[i];
            }
            else
            {
                load+=weights[i];
            }

        }
        return days;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
        System.out.println(shipWithinDays(arr,d));
    }
}
