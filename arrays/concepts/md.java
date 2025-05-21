package arrays.concepts;
import java.util.Arrays;
import java.util.Scanner;
public class md {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("n:");
    int n = sc.nextInt();
    System.out.println("m:");
    int m = sc.nextInt();
    int[][] arr = new int[n][m];
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<m;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("The elements in the array are");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {

            System.out.print(arr[i][j] + " ");
            if(j==m-1)
            {
                System.out.println("\n");
            }
        }
        
    }
    // enhanced for loop
    for( int[] row:arr)
        System.out.println(Arrays.toString(row));
    //to string method
}
    
}
