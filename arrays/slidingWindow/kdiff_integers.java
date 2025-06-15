package arrays.slidingWindow;

public class kdiff_integers {
    public static void main(String[] args) {

    int [] arr = {1,2,1,2,3};
    int goal=3; int new_cnt =0;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    if(arr[k]==arr[j])
                    {
                        break;
                    }
                    else count++;
                }
                if(count==goal)
                {
                    new_cnt++;
                    System.out.println("found");
                    break;
                }
                else
                {
                    count=0;
                }
            }

        }
        System.out.println(new_cnt);
    }

}
