
import java.lang.reflect.Array;
import java.util.Scanner;

// public class count
// {
//     public static void main(String[] args) {
//         int num;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         num = sc.nextInt();
//       String str = Integer.toString(num);
//       int count=0;
//       for(int i = 0 ;i<str.length();i++)
//       {
//         count++;
//       }
//       System.out.println(count);

//       sc.close();
//     }
// }
// 


// public class sort
// {
//     public static void main(String[] args) {
//         int num;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         num = sc.nextInt();
//         System.out.println("enter the elements in the array");
//         int arr[] = new int[num];
//         for(int i = 0 ;i<num;i++)
//         {
//             arr[i] = sc.nextInt();
//         }  
          
//       for(int i=0;i<num-1;i++)
//       {
//         if(arr[i]>arr[i+1])
//         {
//             System.out.println(" array is not sorted");
//             break;
//         }
//       }
//     }
// }
public class frequency_finder
{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.println("enter the elements in the array");
        int arr[] = new int[num];
        for(int i = 0 ;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to find the frequency");
        int ele = sc.nextInt();
        int count = 0;
        for(int i = 0 ;i<num;i++)
        {
            if(arr[i] == ele)
            {
                count++;
            }
        }
        System.out.println("The frequency of the element " + ele + " is " + count);
        

        for(int i=0;i<num;i++)
        {
            for(int j =i+1;j<num;j++)
            {

                if(arr[i]==arr[j] )
                {
                    System.out.println("The element " + arr[i] + " is repeated " + (j-i+1)+ "times");
                    
                    
                }

            }
        }
        sc.close();
        
    }
}
