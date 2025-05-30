package arrays.slidingWindow;

public class max_card_points {
    public static void main(String[] args) {
    int arr[] = {1,1,1,1,0,0,0,1,1,1,1,0};
        for (int i = 0; i <arr.length ; i++) {
            for(int j=0;j<arr.length;j++)
            {
              for(int k=i;k<=j;k++)
              {
                  System.out.print(arr[k]+ " ");
              }

            }
            System.out.println();

        }


    }

}
