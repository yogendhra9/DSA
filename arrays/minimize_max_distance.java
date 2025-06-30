package arrays;

public class minimize_max_distance {
    static double minimize_distance(int [] arr,int k)
    {
        int[] how_many = new int[arr.length-1];

        for(int i=0;i<k;i++)
        {
            double  max_val = -1;
            int max_val_found = -1;
            for(int j=0;j<arr.length-1;j++)
            {
                 double diff = arr[j+1]-arr[j];
                double section_length = diff/(how_many[j]+1);
                if(section_length>max_val)
                {
                    max_val= section_length;
                    max_val_found = j;
                }
                System.out.println("Adding cut in gap: " + max_val_found + " Current section size: " + max_val);

            }
            how_many[max_val_found]++;


        }
        double maxAns=-1;
        for (int i = 0; i < arr.length-1; i++) {
            double diff = arr[i+1]-arr[i];
            double sector= diff/(how_many[i]+1);
            maxAns = Math.max(maxAns,sector);

        }
        return maxAns;
    }

    public static void main(String[] args) {
        int[] arr = {1,10};
        int k = 2;
        double ans = minimize_distance(arr,k);
        System.out.println(ans);
    }
}
