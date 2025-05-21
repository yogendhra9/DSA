package arrays.searching;

import java.util.Scanner;

public class linear_search_in_2d {
    public static void main(String[] args) {
        int[][] arr = new int [3][2];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int target = 6;
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                if(target == arr[i][j])
                {
                    System.out.println("found" + "at" + i + "th row" + j + "th coloumn" );
                    break;
                }
                else
                {
                   continue;
                }
            }
        }

    }
}
