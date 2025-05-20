package arrays;
import java.util.Scanner;

public class dynamic {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        Scanner sc  = new Scanner(System.in);
        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
                if(j == arr[i].length-1)
                {
                    System.out.println("/n");
                }
            }

        }
        //enhanced loop
        for(int[] row:arr)
        {
            for(int elem:row)
            {
                System.out.println(elem);
            }
        }

    }

}
